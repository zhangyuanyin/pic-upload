package com.gome.dao.slave;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.gome.domain.TmAppPrimApplicantInfo;
import com.gome.domain.TmAppPrimApplicantInfoExample;

public interface TmAppPrimApplicantInfoDao {
    long countByExample(TmAppPrimApplicantInfoExample example);

    int deleteByExample(TmAppPrimApplicantInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TmAppPrimApplicantInfo record);

    int insertSelective(TmAppPrimApplicantInfo record);

    List<TmAppPrimApplicantInfo> selectByExample(TmAppPrimApplicantInfoExample example);
    
    List<TmAppPrimApplicantInfo> selectByConditions(Map<String, Object> paramMap);


    TmAppPrimApplicantInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TmAppPrimApplicantInfo record, @Param("example") TmAppPrimApplicantInfoExample example);

    int updateByExample(@Param("record") TmAppPrimApplicantInfo record, @Param("example") TmAppPrimApplicantInfoExample example);

    int updateByPrimaryKeySelective(TmAppPrimApplicantInfo record);

    int updateByPrimaryKey(TmAppPrimApplicantInfo record);
}