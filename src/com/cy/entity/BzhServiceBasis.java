package com.cy.entity;

import java.io.Serializable;
/**
 * 基础条例 实体类
 */

public class BzhServiceBasis implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4622722667388536243L;

	/**
     * 条例ID
     */
	private String servicebasisid;

    /**
     * 条例名称
     */
	private String name;

    /**
     * 条例部门
     */
	private String servicebasisoffice;

    /**
     * 发布日期
     */
	private String publishdate;

    /**
     * 条例号
     */
	private String basisNum;

    /**
     * 条例级别
     */
	private String servicebasislayer;

    /**
     * 发布机构
     */
	private String basisorgan;

    /**
     * 发布城镇
     */
	private String town;

    /**
     * 序号
     */
	private String basisSort;

    /**
     * 条例ID
     */
	public void setServicebasisid(String servicebasisid){
		this.servicebasisid=servicebasisid;
	}

    /**
     * 条例ID
     */
	public String getServicebasisid(){
		return servicebasisid;
	}

    /**
     * 条例名称
     */
	public void setName(String name){
		this.name=name;
	}

    /**
     * 条例名称
     */
	public String getName(){
		return name;
	}

    /**
     * 条例部门
     */
	public void setServicebasisoffice(String servicebasisoffice){
		this.servicebasisoffice=servicebasisoffice;
	}

    /**
     * 条例部门
     */
	public String getServicebasisoffice(){
		return servicebasisoffice;
	}

    /**
     * 发布日期
     */
	public void setPublishdate(String publishdate){
		this.publishdate=publishdate;
	}

    /**
     * 发布日期
     */
	public String getPublishdate(){
		return publishdate;
	}

    /**
     * 条例号
     */
	public void setBasisNum(String basisNum){
		this.basisNum=basisNum;
	}

    /**
     * 条例号
     */
	public String getBasisNum(){
		return basisNum;
	}

    /**
     * 条例级别
     */
	public void setServicebasislayer(String servicebasislayer){
		this.servicebasislayer=servicebasislayer;
	}

    /**
     * 条例级别
     */
	public String getServicebasislayer(){
		return servicebasislayer;
	}

    /**
     * 发布机构
     */
	public void setBasisorgan(String basisorgan){
		this.basisorgan=basisorgan;
	}

    /**
     * 发布机构
     */
	public String getBasisorgan(){
		return basisorgan;
	}

    /**
     * 发布城镇
     */
	public void setTown(String town){
		this.town=town;
	}

    /**
     * 发布城镇
     */
	public String getTown(){
		return town;
	}

    /**
     * 序号
     */
	public void setBasisSort(String basisSort){
		this.basisSort=basisSort;
	}

    /**
     * 序号
     */
	public String getBasisSort(){
		return basisSort;
	}

}
