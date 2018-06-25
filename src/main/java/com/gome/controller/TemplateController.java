package com.gome.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gome.domain.TmAppPrimApplicantInfo;
import com.gome.service.ApplicantService;

@Controller
public class TemplateController {
	
	@Autowired
	private ApplicantService applicantService;
	
	@RequestMapping("/test")
	public String test(Map<String, Object> dataMap) {
		dataMap.put("test", "thymeleaf test");
		return "/test";
	}
	
	@RequestMapping(value = "/fen/{appNo}", method = RequestMethod.GET)
	public String findPicture(@PathVariable String appNo, ModelMap map) {
		List<TmAppPrimApplicantInfo> result = applicantService.findTmAppPrimApplicantInfoByAppNo(appNo);
		System.out.println(result.size());
		return "/test";
	}
}
