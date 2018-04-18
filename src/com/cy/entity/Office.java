package com.cy.entity;

import java.io.Serializable;
/**
 * 部门 实体类
 */

public class Office implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5773438040620701370L;

	/**
     * 部门编码
     */
	private String officeId;

    /**
     * 镇街编码
     */
	private String townId;

    /**
     * 部门名称
     */
	private String officeName;

    /**
     * 联系电话
     */
	private String officePhone;

    /**
     * 联系地址
     */
	private String officeAddress;

    /**
     * 部门类型
     */
	private String officeSort;

    /**
     * 机构代码
     */
	private String officeCode;

    /**
     * 部门编码
     */
	public void setOfficeId(String officeId){
		this.officeId=officeId;
	}

    /**
     * 部门编码
     */
	public String getOfficeId(){
		return officeId;
	}

    /**
     * 镇街编码
     */
	public void setTownId(String townId){
		this.townId=townId;
	}

    /**
     * 镇街编码
     */
	public String getTownId(){
		return townId;
	}

    /**
     * 部门名称
     */
	public void setOfficeName(String officeName){
		this.officeName=officeName;
	}

    /**
     * 部门名称
     */
	public String getOfficeName(){
		return officeName;
	}

    /**
     * 联系电话
     */
	public void setOfficePhone(String officePhone){
		this.officePhone=officePhone;
	}

    /**
     * 联系电话
     */
	public String getOfficePhone(){
		return officePhone;
	}

    /**
     * 联系地址
     */
	public void setOfficeAddress(String officeAddress){
		this.officeAddress=officeAddress;
	}

    /**
     * 联系地址
     */
	public String getOfficeAddress(){
		return officeAddress;
	}

    /**
     * 部门类型
     */
	public void setOfficeSort(String officeSort){
		this.officeSort=officeSort;
	}

    /**
     * 部门类型
     */
	public String getOfficeSort(){
		return officeSort;
	}

    /**
     * 机构代码
     */
	public void setOfficeCode(String officeCode){
		this.officeCode=officeCode;
	}

    /**
     * 机构代码
     */
	public String getOfficeCode(){
		return officeCode;
	}

}
