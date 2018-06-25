package com.gome.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gome.domain.Picture;
import com.gome.domain.TmAppPrimApplicantInfo;
import com.gome.service.ApplicantService;
import com.gome.service.PictureService;

@Controller
@RequestMapping("/pictures")
public class PictureController {
	private Logger logger = Logger.getLogger(PictureController.class);
	
	@Autowired
	private PictureService pictureService;
	@Autowired
	private ApplicantService applicantService;
	
	@RequestMapping(value = "/find/one/{id}", method = RequestMethod.GET)
	public String findPicture(@PathVariable Long id, ModelMap map) {
		map.put("picture", pictureService.findPictureById(id));
		map.put("download", pictureService.download(id));
		return "pic_details";
	}
	
	@RequestMapping(value = "/find/list/{appNo}", method = RequestMethod.GET)
	public String findPicture(Model model, @PathVariable String appNo, @RequestParam(defaultValue = "0")Integer pageNum, @RequestParam(defaultValue = "10")Integer pageSize) {
		this.logger.info("【PIC-SYS】查询进件号："+appNo);
		PageHelper.startPage(pageNum, pageSize);
		List<Picture> pictures = pictureService.findPictureByAppNo(appNo);
		PageInfo<Picture> pageInfo = new PageInfo<Picture>(pictures);
		
		model.addAttribute("appNo", appNo);
		model.addAttribute("page", pageInfo);
		model.addAttribute("pictures", pageInfo.getList());
		
		return "pic_list_details";
	}
	
	@RequestMapping(value = "/show/one/{id}", method = RequestMethod.GET)
	public String showPicture(@PathVariable Long id, ModelMap map) {
		map.put("appNo", pictureService.findPictureById(id).getAppNo());
		map.put("download", pictureService.download(id));
		return "pic_show_screen";
	}
	
	@RequestMapping(value = "/show/list/{appNo}", method = RequestMethod.GET)
	public String showPicture(@PathVariable String appNo, ModelMap map) {
		map.put("appNo", appNo);
		map.put("scanurls", pictureService.showPictures(appNo));
		return "pic_list_show_screen";
	}
	
	@RequestMapping(value = "/app/list", method = RequestMethod.GET)
	public String findApplicantInfo(Model model, @RequestParam(defaultValue = "0")Integer pageNum, @RequestParam(defaultValue = "15")Integer pageSize) {
		this.logger.info("【BUS-SYS】查询页号："+pageNum);
		PageHelper.startPage(pageNum, pageSize);
		
		List<TmAppPrimApplicantInfo> applicantInfos = applicantService.findApplicantInfoByAgeAndGender();
		PageInfo<TmAppPrimApplicantInfo> pageInfo = new PageInfo<TmAppPrimApplicantInfo>(applicantInfos);
		model.addAttribute("page", pageInfo);
		model.addAttribute("applicants", pageInfo.getList());
		
		return "pic_list_app_details";
	}
	
}
