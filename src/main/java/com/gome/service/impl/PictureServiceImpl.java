package com.gome.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.gome.dao.master.PictureDao;
import com.gome.domain.Picture;
import com.gome.domain.PictureExample;
import com.gome.service.PictureService;

/**
 * <dt>处理图片信息</dt>
 * @author yyzhang 
 * @since 2018年5月10日18:12:26
 */
@Service
public class PictureServiceImpl implements PictureService {
	@Value("${pic.rows}")
	private int rows;
	@Value("${pic.sysNo}")
	private String sysNo;
	@Value("${pic.mj.curSysNo}")
	private String curSysNo;
	
	@Autowired
	private PictureDao pictureDao;

	@Override
	public List<Picture> findPictures() {
		return pictureDao.selectByIndentify(sysNo, rows);
	}

	@Override
	public void updatePictureById(Picture picture) {
		pictureDao.updateByPrimaryKey(picture);
	}

	@Override
	public Picture findPictureById(long id) {
		return pictureDao.selectByPrimaryKey(id);
	}
	
	@Override
	public String download(long id) {
		Picture picture = findPictureById(id);
		if("1".equals(picture.getPicFlag())) {
			return "http://10.143.92.200/pic-app/file/" + picture.getSysName() + "/" + picture.getAppNo() + "/" + picture.getSubclassSort() + "/" + picture.getSavename();
		}
		
		if("mj".equals(picture.getSysName()))
			return "http://10.143.92.200/fastdfs-gateway-rmps/rmps/download?curSysNo=0909&key="+picture.getkId();
		else 
			return "http://10.143.92.200/fastdfs-gateway/ffce/download?curSysNo=0601&key="+picture.getkId();
	}

	@Override
	public List<Picture> findPictureByAppNo(String appNo) {
		PictureExample example = new PictureExample();
		example.createCriteria().andAppNoEqualTo(appNo);
		List<Picture> pictures = pictureDao.selectByExample(example);
		if(pictures == null) {
			pictures = Collections.emptyList();
		}
		for (Picture picture : pictures) {
			picture.setScanUrl(download(picture.getId()));
		}
		return pictures;
	}

	@Override
	public List<String> showPictures(String appNo) {
		List<String> scanurls = new ArrayList<String>();
		PictureExample example = new PictureExample();
		example.createCriteria().andAppNoEqualTo(appNo);
		List<Picture> pictures = pictureDao.selectByExample(example);
		if(pictures == null) {
			return Collections.emptyList();
		}
		for (Picture picture : pictures) {
			scanurls.add(download(picture.getId()));
		}
		return scanurls;
	}
}
