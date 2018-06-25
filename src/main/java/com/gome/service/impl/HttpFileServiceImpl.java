package com.gome.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.gome.domain.BodyModel;
import com.gome.domain.FileModel;
import com.gome.domain.Picture;
import com.gome.service.HttpFileService;
import com.gome.util.GomeCommonUtil;

/**
 * <dt>图片上传、下载服务处理类</dt>
 * 
 * @author yyzhang
 * @since 2018年2月1日17:31:37
 */
@Service
public class HttpFileServiceImpl implements HttpFileService {

	@Override
	public Map<String, String> upload(Picture picture, InputStream in) {
		this.logger.info(" ========= 上传图片 【"+picture.getId()+"】开始  ========= ");
		this.logger.info("【文件名称】【"+picture.getId()+"】：" + picture.getImgname());

		Map<String, String> dataMap = new ConcurrentHashMap<String, String>();
		String requestUrl = "", fileNm = "", sysNo = picture.getSysName();
		try {
			if (SYS_NO_MJ.equals(sysNo))
				requestUrl = mjRequestUrl.get();
			else
				requestUrl = mfRequestUrl.get();

			HttpPost httpPost = new HttpPost(requestUrl);
			MultipartEntity partEntity = new MultipartEntity();
			this.logger.info("【上传地址】：" + requestUrl);

			StringBody isStatic = new StringBody("1", Charset.forName("UTF-8"));
			StringBody sysName = new StringBody(SYS_NO_MJ.equals(sysNo) ? mjSysNo : mfSysNo, Charset.forName("UTF-8"));

			String fileName = picture.getImgname();
			if (GomeCommonUtil.isChinese(fileName.toCharArray())) {
				fileNm = MD5Encoder.encode(fileName.getBytes());
				dataMap.put(fileNm, fileName);
				ContentBody contentBody = new ByteArrayBody(GomeCommonUtil.toFileByte(in), fileNm);
				partEntity.addPart(fileNm, contentBody);
			} else {
				ContentBody contentBody = new ByteArrayBody(GomeCommonUtil.toFileByte(in), fileName);
				partEntity.addPart(fileName, contentBody);
			}
			
			partEntity.addPart("sysName", sysName);
			partEntity.addPart("isStatic", isStatic);
			httpPost.setEntity(partEntity);

			HttpEntity resEntity = this.execute(httpPost);
			if(null != resEntity){
                String result = EntityUtils.toString(resEntity, Charset.forName("UTF-8"));
                logger.info("【响应结果】：" + result);
                dataMap = this.parseValue(result, sysNo, requestUrl);
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.logger.info(" ========= 上传图片【"+picture.getId()+"】结束 ========= ");
		
		return dataMap;
	}

	@Override
	public Map<String, String> download(Picture picture) {
		Map<String, String> resultMap = Collections.emptyMap();
		StringBuffer url = new StringBuffer();
    	
		url = url.append(getUrl(picture.getSysName(), picture.getAppNo(), picture.getSubclassSort(), picture.getSavename()));
        this.logger.info("【影像迁移】下载文件地址：" + url);
        
        try {
			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpGet get = new HttpGet(url.toString());
			HttpResponse response = httpClient.execute(get);
			
			// 获取并验证执行结果
			int code = response.getStatusLine().getStatusCode();
			if(code == HttpStatus.SC_OK){
				InputStream in = response.getEntity().getContent();
				resultMap = upload(picture, in);
			}else {
				this.logger.info("【影像迁移】下载失败！！！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        return resultMap;
	}

	/**
	 * 执行请求统一入口
	 * @param httpPost
	 */
	private HttpEntity execute(Object reqType) {
		HttpClient httpClient = new DefaultHttpClient();
		HttpResponse response = null;
		HttpEntity resEntity = null;
		try {
			if (reqType instanceof HttpPost) {
				response = httpClient.execute((HttpPost) reqType);
			} else {
				response = httpClient.execute((HttpGet) reqType);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int statusCode = response.getStatusLine().getStatusCode();

		// 获取响应对象
		if (statusCode == HttpStatus.SC_OK) {
			resEntity = response.getEntity();
		}
		return resEntity;
	}
	
	/**
     * 解析json
     * @param result json
     * @return
     */
    private Map<String, String> parseValue(String result, String sysNo, String requestUrl){
    	Map<String, String> dataMap = new ConcurrentHashMap<String, String>();
        StringBuilder picPaths = new StringBuilder();
        //拼装地址
        String downloadUrl = requestUrl.replaceAll("upload", "download");
        String curSysNo = SYS_NO_MJ.equals(sysNo) ? this.mjCurSysNo : this.mfCurSysNo;
        //我知道GSON可以直接转为MAP
        FileModel fileModel = JSON.parseObject(result, FileModel.class);
        
        if(null != fileModel.getBody()){
            for(BodyModel bodyModel : fileModel.getBody()){
            	if(dataMap.containsKey(bodyModel.getFieldName())) {
            		dataMap.put(dataMap.get(bodyModel.getFieldName()), bodyModel.getKey());
            	}else {
            		dataMap.put(bodyModel.getFieldName(), bodyModel.getKey());
            	}
                picPaths.append(",").append(downloadUrl).append("?")
                		.append(curSysNo).append("&key=").append(bodyModel.getKey());
            }
            dataMap.put("picPaths", picPaths.substring(1));
        }
        dataMap.put("state", fileModel.getState());
        dataMap.put("status", fileModel.getStatus());
        dataMap.put("showMessage", fileModel.getShowMessage());
        
        return dataMap;
    }
    
    private static String getUrl(String sysNo, String appNo, String type, String filename) {
		return "http://10.143.92.200/pic-app/file/" + sysNo + "/" + appNo + "/" + type + "/" + filename;
	}

	public void setMjSysNo(String mjSysNo) {
		this.mjSysNo = mjSysNo;
	}

	public void setMjCurSysNo(String mjCurSysNo) {
		this.mjCurSysNo = mjCurSysNo;
	}

	public void setMjUrl(String mjUrl) {
		this.mjUrl = mjUrl;
	}

	public void setMfSysNo(String mfSysNo) {
		this.mfSysNo = mfSysNo;
	}

	public void setMfCurSysNo(String mfCurSysNo) {
		this.mfCurSysNo = mfCurSysNo;
	}

	public void setMfUrl(String mfUrl) {
		this.mfUrl = mfUrl;
	}

	// 定义美借请求地址
	private final ThreadLocal<String> mjRequestUrl = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return mjUrl + mjSysNo + "/upload";
		}
	};
	// 定义非美借请求地址
	private final ThreadLocal<String> mfRequestUrl = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return mfUrl + mfSysNo + "/upload";
		}
	};

	private Logger logger = Logger.getLogger(HttpFileServiceImpl.class);
	private static final String SYS_NO_MJ = "mj"; // 美借系统标识符

	// 美借配置信息
	@Value("${pic.mj.sysNo}")
	private String mjSysNo;
	@Value("${pic.mj.curSysNo}")
	private String mjCurSysNo;
	@Value("${pic.mj.url}")
	private String mjUrl;

	// 美分配置信息
	@Value("${pic.mf.sysNo}")
	private String mfSysNo;
	@Value("${pic.mf.curSysNo}")
	private String mfCurSysNo;
	@Value("${pic.mf.url}")
	private String mfUrl;
}
