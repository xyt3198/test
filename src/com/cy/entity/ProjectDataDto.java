package com.cy.entity;

import java.io.Serializable;
/**
 * 项目数据-dto 实体类
 */

public class ProjectDataDto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2845054600911022471L;

	/**
     * 材料编码
     */
	private String c_projectdata_id;

    /**
     * 事项编码
     */
	private String c_projectdata_project;

    /**
     * 材料名称
     */
	private String v_projectdata_name;

    /**
     * 是否必须
     */
	private String c_projectdata_isneed;

    /**
     * 原件份数
     */
	private int i_projectdata_original;

    /**
     * 复印件份数
     */
	private int i_projectdata_copy;

    /**
     * 事项ID
     */
	private String projectId;

    /**
     * 材料编码
     */
	public void setC_projectdata_id(String c_projectdata_id){
		this.c_projectdata_id=c_projectdata_id;
	}

    /**
     * 材料编码
     */
	public String getC_projectdata_id(){
		return c_projectdata_id;
	}

    /**
     * 事项编码
     */
	public void setC_projectdata_project(String c_projectdata_project){
		this.c_projectdata_project=c_projectdata_project;
	}

    /**
     * 事项编码
     */
	public String getC_projectdata_project(){
		return c_projectdata_project;
	}

    /**
     * 材料名称
     */
	public void setV_projectdata_name(String v_projectdata_name){
		this.v_projectdata_name=v_projectdata_name;
	}

    /**
     * 材料名称
     */
	public String getV_projectdata_name(){
		return v_projectdata_name;
	}

    /**
     * 是否必须
     */
	public void setC_projectdata_isneed(String c_projectdata_isneed){
		this.c_projectdata_isneed=c_projectdata_isneed;
	}

    /**
     * 是否必须
     */
	public String getC_projectdata_isneed(){
		return c_projectdata_isneed;
	}

    /**
     * 原件份数
     */
	public void setI_projectdata_original(int i_projectdata_original){
		this.i_projectdata_original=i_projectdata_original;
	}

    /**
     * 原件份数
     */
	public int getI_projectdata_original(){
		return i_projectdata_original;
	}

    /**
     * 复印件份数
     */
	public void setI_projectdata_copy(int i_projectdata_copy){
		this.i_projectdata_copy=i_projectdata_copy;
	}

    /**
     * 复印件份数
     */
	public int getI_projectdata_copy(){
		return i_projectdata_copy;
	}

    /**
     * 事项ID
     */
	public void setProjectId(String projectId){
		this.projectId=projectId;
	}

    /**
     * 事项ID
     */
	public String getProjectId(){
		return projectId;
	}

}
