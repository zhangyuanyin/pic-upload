package com.gome.service;

import java.util.List;

import com.gome.domain.TmAppPrimApplicantInfo;

public interface ApplicantService {
	List<TmAppPrimApplicantInfo> findTmAppPrimApplicantInfoByAppNo(String appNo);
	
	List<TmAppPrimApplicantInfo> findApplicantInfoByAgeAndGender();
}
