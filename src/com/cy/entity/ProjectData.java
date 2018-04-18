package com.cy.entity;

import java.io.Serializable;
/**
 * 项目数据 实体类
 */

public class ProjectData implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4886378054597086857L;

	/**
     * 材料编码
     */
	private String projectdataId;

    /**
     * 事项编码
     */
	private String c_project;

    /**
     * 材料名称
     */
	private String name;

    /**
     * 是否必须
     */
	private String isNeed;

    /**
     * 原件份数
     */
	private int original;

    /**
     * 复印件份数
     */
	private int copy;

    /**
     * 佛山编码
     */
	private String fsid;

    /**
     * 材料来源，值：行政机关、村居委会、商会、行业协会、中介机构、申请人
     */
	private String servicedatasource;

    /**
     * 要求
     */
	private String servicedatarequest;

    /**
     * 纸质/电子版，值：纸质、电子版
     */
	private String ispaper;

    /**
     * 备注说明
     */
	private String description;

    /**
     * 材料编码
     */
	public void setProjectdataId(String projectdataId){
		this.projectdataId=projectdataId;
	}

    /**
     * 材料编码
     */
	public String getProjectdataId(){
		return projectdataId;
	}

    /**
     * 事项编码
     */
	public void setC_project(String c_project){
		this.c_project=c_project;
	}

    /**
     * 事项编码
     */
	public String getC_project(){
		return c_project;
	}

    /**
     * 材料名称
     */
	public void setName(String name){
		this.name=name;
	}

    /**
     * 材料名称
     */
	public String getName(){
		return name;
	}

    /**
     * 是否必须
     */
	public void setIsNeed(String isNeed){
		this.isNeed=isNeed;
	}

    /**
     * 是否必须
     */
	public String getIsNeed(){
		return isNeed;
	}

    /**
     * 原件份数
     */
	public void setOriginal(int original){
		this.original=original;
	}

    /**
     * 原件份数
     */
	public int getOriginal(){
		return original;
	}

    /**
     * 复印件份数
     */
	public void setCopy(int copy){
		this.copy=copy;
	}

    /**
     * 复印件份数
     */
	public int getCopy(){
		return copy;
	}

    /**
     * 佛山编码
     */
	public void setFsid(String fsid){
		this.fsid=fsid;
	}

    /**
     * 佛山编码
     */
	public String getFsid(){
		return fsid;
	}

    /**
     * 材料来源，值：行政机关、村居委会、商会、行业协会、中介机构、申请人
     */
	public void setServicedatasource(String servicedatasource){
		this.servicedatasource=servicedatasource;
	}

    /**
     * 材料来源，值：行政机关、村居委会、商会、行业协会、中介机构、申请人
     */
	public String getServicedatasource(){
		return servicedatasource;
	}

    /**
     * 要求
     */
	public void setServicedatarequest(String servicedatarequest){
		this.servicedatarequest=servicedatarequest;
	}

    /**
     * 要求
     */
	public String getServicedatarequest(){
		return servicedatarequest;
	}

    /**
     * 纸质/电子版，值：纸质、电子版
     */
	public void setIspaper(String ispaper){
		this.ispaper=ispaper;
	}

    /**
     * 纸质/电子版，值：纸质、电子版
     */
	public String getIspaper(){
		return ispaper;
	}

    /**
     * 备注说明
     */
	public void setDescription(String description){
		this.description=description;
	}

    /**
     * 备注说明
     */
	public String getDescription(){
		return description;
	}

}
