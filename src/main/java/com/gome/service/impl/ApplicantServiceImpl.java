package com.gome.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import com.gome.dao.slave.TmAppPrimApplicantInfoDao;
import com.gome.domain.TmAppPrimApplicantInfo;
import com.gome.domain.TmAppPrimApplicantInfoExample;
import com.gome.service.ApplicantService;
import com.gome.util.Constant;
import com.gome.util.DateTimeUtil;

@Service
public class ApplicantServiceImpl implements ApplicantService {
	
	@Autowired
	private TmAppPrimApplicantInfoDao applicantInfoDao;

	@Override
	public List<TmAppPrimApplicantInfo> findTmAppPrimApplicantInfoByAppNo(String appNo) {
		TmAppPrimApplicantInfoExample example = new TmAppPrimApplicantInfoExample();
		example.createCriteria().andAppNoEqualTo(appNo);
		return applicantInfoDao.selectByExample(example);
	}

	@Override
	@CachePut(value = "applicant", key = "\"applicant_all\"")
	public List<TmAppPrimApplicantInfo> findApplicantInfoByAgeAndGender() {
		TmAppPrimApplicantInfoExample example = new TmAppPrimApplicantInfoExample();
		example.createCriteria().andAgeLessThanOrEqualTo((short) 25)
			   .andGenderEqualTo(Constant.GENDER_FEMALE)
			   .andIdLessThan(20000000).andIdGreaterThan(10000000);
//			   .andCreateTimeGreaterThan(DateTimeUtil.parseDate("2017-09-01"));
//		return applicantInfoDao.selectByExample(example);
		return applicantInfoDao.selectByConditions(new HashMap<String, Object>());
	}
}
