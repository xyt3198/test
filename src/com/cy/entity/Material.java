package com.cy.entity;

import java.io.Serializable;
/**
 * 材料 实体类
 */

public class Material implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3013266694555664853L;

	/**
     * ID
     */
	private String id;

    /**
     * 情形ID
     */
	private String case_id;

    /**
     * 未知
     */
	private String servicedata_id;

    /**
     * 需求材料
     */
	private String request;

    /**
     * 原件
     */
	private String original;

    /**
     * 复印件份数
     */
	private String copy;

    /**
     * 文档类型
     */
	private String ispaper;

    /**
     * 序号
     */
	private String bind_sort;

    /**
     * 是否必须
     */
	private String isNeed;

    /**
     * ID
     */
	public void setId(String id){
		this.id=id;
	}

    /**
     * ID
     */
	public String getId(){
		return id;
	}

    /**
     * 情形ID
     */
	public void setCase_id(String case_id){
		this.case_id=case_id;
	}

    /**
     * 情形ID
     */
	public String getCase_id(){
		return case_id;
	}

    /**
     * 未知
     */
	public void setServicedata_id(String servicedata_id){
		this.servicedata_id=servicedata_id;
	}

    /**
     * 未知
     */
	public String getServicedata_id(){
		return servicedata_id;
	}

    /**
     * 需求材料
     */
	public void setRequest(String request){
		this.request=request;
	}

    /**
     * 需求材料
     */
	public String getRequest(){
		return request;
	}

    /**
     * 原件
     */
	public void setOriginal(String original){
		this.original=original;
	}

    /**
     * 原件
     */
	public String getOriginal(){
		return original;
	}

    /**
     * 复印件份数
     */
	public void setCopy(String copy){
		this.copy=copy;
	}

    /**
     * 复印件份数
     */
	public String getCopy(){
		return copy;
	}

    /**
     * 文档类型
     */
	public void setIspaper(String ispaper){
		this.ispaper=ispaper;
	}

    /**
     * 文档类型
     */
	public String getIspaper(){
		return ispaper;
	}

    /**
     * 序号
     */
	public void setBind_sort(String bind_sort){
		this.bind_sort=bind_sort;
	}

    /**
     * 序号
     */
	public String getBind_sort(){
		return bind_sort;
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

}
