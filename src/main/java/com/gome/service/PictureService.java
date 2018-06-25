package com.gome.service;

import java.util.List;

import com.gome.domain.Picture;

/**
 * <dt>图片逻辑处理类</dt>
 * @author yyzhang
 * @since 2018年5月10日18:08:36
 */
public interface PictureService {
	
	List<Picture> findPictures();
	
	Picture findPictureById(long id);
	
	String download(long id);
	
	List<Picture> findPictureByAppNo(String appNo);
	
	void updatePictureById(Picture picture);

	List<String> showPictures(String appNo);
}
