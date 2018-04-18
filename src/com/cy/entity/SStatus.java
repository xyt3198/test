package com.cy.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * s_status 实体类
 */

public class SStatus implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6897790895912056635L;

	/**
     * 行政服务中心业务流水号
     */
	private String c_accept;

    /**
     * 办理人账号
     */
	private String c_operators;

    /**
     * 办理人姓名
     */
	private String v_operators;

    /**
     * 办理状态
     */
	private String status;

    /**
     * 办理环节
     */
	private String type;

    /**
     * 办理意见
     */
	private String sign;

    /**
     * 备注
     */
	private String memo;

    /**
     * 环节开始时间
     */
	private Date d_start;

    /**
     * 办理时间
     */
	private Date d_finish;

    /**
     * 承诺天数
     */
	private int promise;

    /**
     * 承诺到期时间
     */
	private Date d_promise;

    /**
     * 所属部门编码
     */
	private String officeId;

    /**
     * 特别程序编码
     */
	private String c_projectHung;

    /**
     * 行政服务中心业务流水号
     */
	public void setC_accept(String c_accept){
		this.c_accept=c_accept;
	}

    /**
     * 行政服务中心业务流水号
     */
	public String getC_accept(){
		return c_accept;
	}

    /**
     * 办理人账号
     */
	public void setC_operators(String c_operators){
		this.c_operators=c_operators;
	}

    /**
     * 办理人账号
     */
	public String getC_operators(){
		return c_operators;
	}

    /**
     * 办理人姓名
     */
	public void setV_operators(String v_operators){
		this.v_operators=v_operators;
	}

    /**
     * 办理人姓名
     */
	public String getV_operators(){
		return v_operators;
	}

    /**
     * 办理状态
     */
	public void setStatus(String status){
		this.status=status;
	}

    /**
     * 办理状态
     */
	public String getStatus(){
		return status;
	}

    /**
     * 办理环节
     */
	public void setType(String type){
		this.type=type;
	}

    /**
     * 办理环节
     */
	public String getType(){
		return type;
	}

    /**
     * 办理意见
     */
	public void setSign(String sign){
		this.sign=sign;
	}

    /**
     * 办理意见
     */
	public String getSign(){
		return sign;
	}

    /**
     * 备注
     */
	public void setMemo(String memo){
		this.memo=memo;
	}

    /**
     * 备注
     */
	public String getMemo(){
		return memo;
	}

    /**
     * 环节开始时间
     */
	public void setD_start(Date d_start){
		this.d_start=d_start;
	}

    /**
     * 环节开始时间
     */
	public Date getD_start(){
		return d_start;
	}

    /**
     * 办理时间
     */
	public void setD_finish(Date d_finish){
		this.d_finish=d_finish;
	}

    /**
     * 办理时间
     */
	public Date getD_finish(){
		return d_finish;
	}

    /**
     * 承诺天数
     */
	public void setPromise(int promise){
		this.promise=promise;
	}

    /**
     * 承诺天数
     */
	public int getPromise(){
		return promise;
	}

    /**
     * 承诺到期时间
     */
	public void setD_promise(Date d_promise){
		this.d_promise=d_promise;
	}

    /**
     * 承诺到期时间
     */
	public Date getD_promise(){
		return d_promise;
	}

    /**
     * 所属部门编码
     */
	public void setOfficeId(String officeId){
		this.officeId=officeId;
	}

    /**
     * 所属部门编码
     */
	public String getOfficeId(){
		return officeId;
	}

    /**
     * 特别程序编码
     */
	public void setC_projectHung(String c_projectHung){
		this.c_projectHung=c_projectHung;
	}

    /**
     * 特别程序编码
     */
	public String getC_projectHung(){
		return c_projectHung;
	}

}
