package com.cy.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 受理 实体类
 */

public class Accept implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1243248144057086360L;

	/**
     * 中心受理号
     */
	private String acceptId;

    /**
     * 部门业务流水号
     */
	private String v_interface;

    /**
     * 申报事项编码
     */
	private String c_project;

    /**
     * 受理类型
     */
	private String acceptType;

    /**
     * 申报经办人
     */
	private String proposor;

    /**
     * 申报单位名称
     */
	private String pdept;

    /**
     * 联系地址
     */
	private String address;

    /**
     * 手机号码
     */
	private String mobile;

    /**
     * 联系电话
     */
	private String phone;

    /**
     * 电子邮箱
     */
	private String email;

    /**
     * 行业
     */
	private String calling;

    /**
     * 所属地区编码
     */
	private String c_town;

    /**
     * 所属部门编码
     */
	private String c_office;

    /**
     * 受理人账号
     */
	private String c_operator;

    /**
     * 受理人姓名
     */
	private String v_operator;

    /**
     * 受理日期
     */
	private Date d_accept;

    /**
     * 受理地点
     */
	private String place;

    /**
     * 证件号码
     */
	private String idNumber;

    /**
     * 办理意见
     */
	private String memo;

    /**
     * 备注
     */
	private String remark;

    /**
     * 申报业务情形
     */
	private String business_case;

    /**
     * 中心受理号
     */
	public void setAcceptId(String acceptId){
		this.acceptId=acceptId;
	}

    /**
     * 中心受理号
     */
	public String getAcceptId(){
		return acceptId;
	}

    /**
     * 部门业务流水号
     */
	public void setV_interface(String v_interface){
		this.v_interface=v_interface;
	}

    /**
     * 部门业务流水号
     */
	public String getV_interface(){
		return v_interface;
	}

    /**
     * 申报事项编码
     */
	public void setC_project(String c_project){
		this.c_project=c_project;
	}

    /**
     * 申报事项编码
     */
	public String getC_project(){
		return c_project;
	}

    /**
     * 受理类型
     */
	public void setAcceptType(String acceptType){
		this.acceptType=acceptType;
	}

    /**
     * 受理类型
     */
	public String getAcceptType(){
		return acceptType;
	}

    /**
     * 申报经办人
     */
	public void setProposor(String proposor){
		this.proposor=proposor;
	}

    /**
     * 申报经办人
     */
	public String getProposor(){
		return proposor;
	}

    /**
     * 申报单位名称
     */
	public void setPdept(String pdept){
		this.pdept=pdept;
	}

    /**
     * 申报单位名称
     */
	public String getPdept(){
		return pdept;
	}

    /**
     * 联系地址
     */
	public void setAddress(String address){
		this.address=address;
	}

    /**
     * 联系地址
     */
	public String getAddress(){
		return address;
	}

    /**
     * 手机号码
     */
	public void setMobile(String mobile){
		this.mobile=mobile;
	}

    /**
     * 手机号码
     */
	public String getMobile(){
		return mobile;
	}

    /**
     * 联系电话
     */
	public void setPhone(String phone){
		this.phone=phone;
	}

    /**
     * 联系电话
     */
	public String getPhone(){
		return phone;
	}

    /**
     * 电子邮箱
     */
	public void setEmail(String email){
		this.email=email;
	}

    /**
     * 电子邮箱
     */
	public String getEmail(){
		return email;
	}

    /**
     * 行业
     */
	public void setCalling(String calling){
		this.calling=calling;
	}

    /**
     * 行业
     */
	public String getCalling(){
		return calling;
	}

    /**
     * 所属地区编码
     */
	public void setC_town(String c_town){
		this.c_town=c_town;
	}

    /**
     * 所属地区编码
     */
	public String getC_town(){
		return c_town;
	}

    /**
     * 所属部门编码
     */
	public void setC_office(String c_office){
		this.c_office=c_office;
	}

    /**
     * 所属部门编码
     */
	public String getC_office(){
		return c_office;
	}

    /**
     * 受理人账号
     */
	public void setC_operator(String c_operator){
		this.c_operator=c_operator;
	}

    /**
     * 受理人账号
     */
	public String getC_operator(){
		return c_operator;
	}

    /**
     * 受理人姓名
     */
	public void setV_operator(String v_operator){
		this.v_operator=v_operator;
	}

    /**
     * 受理人姓名
     */
	public String getV_operator(){
		return v_operator;
	}

    /**
     * 受理日期
     */
	public void setD_accept(Date d_accept){
		this.d_accept=d_accept;
	}

    /**
     * 受理日期
     */
	public Date getD_accept(){
		return d_accept;
	}

    /**
     * 受理地点
     */
	public void setPlace(String place){
		this.place=place;
	}

    /**
     * 受理地点
     */
	public String getPlace(){
		return place;
	}

    /**
     * 证件号码
     */
	public void setIdNumber(String idNumber){
		this.idNumber=idNumber;
	}

    /**
     * 证件号码
     */
	public String getIdNumber(){
		return idNumber;
	}

    /**
     * 办理意见
     */
	public void setMemo(String memo){
		this.memo=memo;
	}

    /**
     * 办理意见
     */
	public String getMemo(){
		return memo;
	}

    /**
     * 备注
     */
	public void setRemark(String remark){
		this.remark=remark;
	}

    /**
     * 备注
     */
	public String getRemark(){
		return remark;
	}

    /**
     * 申报业务情形
     */
	public void setBusiness_case(String business_case){
		this.business_case=business_case;
	}

    /**
     * 申报业务情形
     */
	public String getBusiness_case(){
		return business_case;
	}

}
