package com.gome.dao.master;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.gome.domain.Picture;
import com.gome.domain.PictureExample;

public interface PictureDao {
    long countByExample(PictureExample example);

    int deleteByExample(PictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureExample example);
    
    List<Picture> selectByExample(PictureExample example, Page<Picture> page);
    
    Page<Picture> selectByExample4Page(PictureExample example);
    
    List<Picture> selectByIndentify(@Param("sysName")String sysName, @Param("limit")int limit);

    Picture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureExample example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}