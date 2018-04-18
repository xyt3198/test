package com.cy.entity;

import java.io.Serializable;
/**
 * 材料基础数据 实体类
 */

public class BzhServiceData implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1321999832299398535L;

	/**
     * ID
     */
	private String id;

    /**
     * 材料名称
     */
	private String name;

    /**
     * 材料来源
     */
	private String servicedatasource;

    /**
     * 原件
     */
	private String original;

    /**
     * 复印件份数
     */
	private String copy;

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
     * 材料来源
     */
	public void setServicedatasource(String servicedatasource){
		this.servicedatasource=servicedatasource;
	}

    /**
     * 材料来源
     */
	public String getServicedatasource(){
		return servicedatasource;
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

}
