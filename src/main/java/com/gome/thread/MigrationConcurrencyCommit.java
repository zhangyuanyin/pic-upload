package com.gome.thread;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.gome.domain.Picture;
import com.gome.service.HttpFileService;
import com.gome.service.PictureService;

/**
 * <dt>分解数据且并发执行</dt>
 * @author yyzhang
 * @since 2018年5月11日10:11:54
 * @param <T>
 */
@Service
@Scope("prototype")
public class MigrationConcurrencyCommit implements Runnable {
	private Logger logger = Logger.getLogger(MigrationConcurrencyCommit.class);
	private static final String STATE_SUCCESS = "000000";
	
	private List<Picture> pictures;
	
	@Autowired
	private HttpFileService httpFileService;
	@Autowired
	private PictureService pictureService;

	@Override
	public void run() {
		if(pictures.size() > 0) {
			for (Picture picture : pictures) {
				Map<String, String> result = httpFileService.download(picture);
				if(result != null && result.size() > 0) {
					if(STATE_SUCCESS.equals(result.get("state")) && !StringUtils.isEmpty(result.get(picture.getImgname()))) {
						picture.setkId(result.get(picture.getImgname()));
						picture.setPicFlag("0");
						picture.setRemark("MIGRAT");
						picture.setUptime(new Date());
						pictureService.updatePictureById(picture);
						logger.info("【影像迁移】更新成功  >>>>>> id:"+picture.getId() + ", key:"+picture.getkId()+", image_name:"+picture.getImgname());
					} else {
						logger.info("【影像迁移】更新失败，id:"+picture.getId());
					}
				}
			}
		}
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
}
