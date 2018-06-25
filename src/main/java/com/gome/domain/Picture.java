package com.gome.domain;

import java.util.Date;

public class Picture {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String org;

    /**
     * 
     */
    private String oenner;

    /**
     * 
     */
    private String idTpye;

    /**
     * 
     */
    private String idNo;

    /**
     * 
     */
    private String outNo;

    /**
     * 
     */
    private String branchid;

    /**
     * 
     */
    private String imgname;

    /**
     * 
     */
    private String savename;

    /**
     * 
     */
    private Long sortsid;

    /**
     * 如审批、催收
     */
    private String geneeicSort;

    /**
     * 如：申请附件，照片，音频等
     */
    private String mediumSort;

    /**
     * 具体类型如：身份证件、工资证明、房产证明
     */
    private String subclassSort;

    /**
     * 
     */
    private Date uptime;

    /**
     * 
     */
    private String appNo;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private String sysName;

    /**
     * Y|是N|否
     */
    private String ifPatchBolt;

    /**
     * 
     */
    private String ifWaste;

    /**
     * 
     */
    private String picFlag;

    /**
     * 
     */
    private String kId;

    /**
     * 
     */
    private String isSmall;
    
    private String scanUrl;
    
    public String getScanUrl() {
		return scanUrl;
	}

	public void setScanUrl(String scanUrl) {
		this.scanUrl = scanUrl;
	}

	/**
     * 
     * @return ID 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return ORG 
     */
    public String getOrg() {
        return org;
    }

    /**
     * 
     * @param org 
     */
    public void setOrg(String org) {
        this.org = org == null ? null : org.trim();
    }

    /**
     * 
     * @return OENNER 
     */
    public String getOenner() {
        return oenner;
    }

    /**
     * 
     * @param oenner 
     */
    public void setOenner(String oenner) {
        this.oenner = oenner == null ? null : oenner.trim();
    }

    /**
     * 
     * @return ID_TPYE 
     */
    public String getIdTpye() {
        return idTpye;
    }

    /**
     * 
     * @param idTpye 
     */
    public void setIdTpye(String idTpye) {
        this.idTpye = idTpye == null ? null : idTpye.trim();
    }

    /**
     * 
     * @return ID_NO 
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 
     * @param idNo 
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * 
     * @return OUT_NO 
     */
    public String getOutNo() {
        return outNo;
    }

    /**
     * 
     * @param outNo 
     */
    public void setOutNo(String outNo) {
        this.outNo = outNo == null ? null : outNo.trim();
    }

    /**
     * 
     * @return BRANCHID 
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 
     * @param branchid 
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid == null ? null : branchid.trim();
    }

    /**
     * 
     * @return IMGNAME 
     */
    public String getImgname() {
        return imgname;
    }

    /**
     * 
     * @param imgname 
     */
    public void setImgname(String imgname) {
        this.imgname = imgname == null ? null : imgname.trim();
    }

    /**
     * 
     * @return SAVENAME 
     */
    public String getSavename() {
        return savename;
    }

    /**
     * 
     * @param savename 
     */
    public void setSavename(String savename) {
        this.savename = savename == null ? null : savename.trim();
    }

    /**
     * 
     * @return SORTSID 
     */
    public Long getSortsid() {
        return sortsid;
    }

    /**
     * 
     * @param sortsid 
     */
    public void setSortsid(Long sortsid) {
        this.sortsid = sortsid;
    }

    /**
     * 如审批、催收
     * @return GENEEIC_SORT 如审批、催收
     */
    public String getGeneeicSort() {
        return geneeicSort;
    }

    /**
     * 如审批、催收
     * @param geneeicSort 如审批、催收
     */
    public void setGeneeicSort(String geneeicSort) {
        this.geneeicSort = geneeicSort == null ? null : geneeicSort.trim();
    }

    /**
     * 如：申请附件，照片，音频等
     * @return MEDIUM_SORT 如：申请附件，照片，音频等
     */
    public String getMediumSort() {
        return mediumSort;
    }

    /**
     * 如：申请附件，照片，音频等
     * @param mediumSort 如：申请附件，照片，音频等
     */
    public void setMediumSort(String mediumSort) {
        this.mediumSort = mediumSort == null ? null : mediumSort.trim();
    }

    /**
     * 具体类型如：身份证件、工资证明、房产证明
     * @return SUBCLASS_SORT 具体类型如：身份证件、工资证明、房产证明
     */
    public String getSubclassSort() {
        return subclassSort;
    }

    /**
     * 具体类型如：身份证件、工资证明、房产证明
     * @param subclassSort 具体类型如：身份证件、工资证明、房产证明
     */
    public void setSubclassSort(String subclassSort) {
        this.subclassSort = subclassSort == null ? null : subclassSort.trim();
    }

    /**
     * 
     * @return UPTIME 
     */
    public Date getUptime() {
        return uptime;
    }

    /**
     * 
     * @param uptime 
     */
    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    /**
     * 
     * @return APP_NO 
     */
    public String getAppNo() {
        return appNo;
    }

    /**
     * 
     * @param appNo 
     */
    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    /**
     * 
     * @return REMARK 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
     * @param remark 
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 
     * @return SYS_NAME 
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * 
     * @param sysName 
     */
    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    /**
     * Y|是N|否
     * @return IF_PATCH_BOLT Y|是N|否
     */
    public String getIfPatchBolt() {
        return ifPatchBolt;
    }

    /**
     * Y|是N|否
     * @param ifPatchBolt Y|是N|否
     */
    public void setIfPatchBolt(String ifPatchBolt) {
        this.ifPatchBolt = ifPatchBolt == null ? null : ifPatchBolt.trim();
    }

    /**
     * 
     * @return IF_WASTE 
     */
    public String getIfWaste() {
        return ifWaste;
    }

    /**
     * 
     * @param ifWaste 
     */
    public void setIfWaste(String ifWaste) {
        this.ifWaste = ifWaste == null ? null : ifWaste.trim();
    }

    /**
     * 
     * @return PIC_FLAG 
     */
    public String getPicFlag() {
        return picFlag;
    }

    /**
     * 
     * @param picFlag 
     */
    public void setPicFlag(String picFlag) {
        this.picFlag = picFlag == null ? null : picFlag.trim();
    }

    /**
     * 
     * @return K_ID 
     */
    public String getkId() {
        return kId;
    }

    /**
     * 
     * @param kId 
     */
    public void setkId(String kId) {
        this.kId = kId == null ? null : kId.trim();
    }

    /**
     * 
     * @return IS_SMALL 
     */
    public String getIsSmall() {
        return isSmall;
    }

    /**
     * 
     * @param isSmall 
     */
    public void setIsSmall(String isSmall) {
        this.isSmall = isSmall == null ? null : isSmall.trim();
    }
}