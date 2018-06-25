package com.gome.service;

import java.io.InputStream;
import java.util.Map;

import com.gome.domain.Picture;

/**
 * <dt>HTTP 服务处理接口</dt>
 * @author yyzhang
 * @since 2018年2月1日16:59:09
 */
public interface HttpFileService {
	
	/**
	 * 图片上传接口
	 * @param files
	 * @param fileNames
	 * @param sysNo 
	 * @return
	 */
	Map<String, String> upload(Picture picture, InputStream in);
	
	/**
	 * 图片下载接口
	 * @param pictureInfo
	 * @param filePath
	 * @return
	 */
	Map<String, String> download(Picture picture);
}
