package com.cy.entity;

import java.io.Serializable;
/**
 * 情形 实体类
 */

public class BusinessCase implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7164540559923686616L;

	/**
     * 业务情形编码
     */
	private String id;

    /**
     * 事项唯一码
     */
	private String service_id;

    /**
     * 情形类型
     */
	private String qxtype;

    /**
     * 情形名称
     */
	private String caseName;

    /**
     * 业务情形编码
     */
	public void setId(String id){
		this.id=id;
	}

    /**
     * 业务情形编码
     */
	public String getId(){
		return id;
	}

    /**
     * 事项唯一码
     */
	public void setService_id(String service_id){
		this.service_id=service_id;
	}

    /**
     * 事项唯一码
     */
	public String getService_id(){
		return service_id;
	}

    /**
     * 情形类型
     */
	public void setQxtype(String qxtype){
		this.qxtype=qxtype;
	}

    /**
     * 情形类型
     */
	public String getQxtype(){
		return qxtype;
	}

    /**
     * 情形名称
     */
	public void setCaseName(String caseName){
		this.caseName=caseName;
	}

    /**
     * 情形名称
     */
	public String getCaseName(){
		return caseName;
	}

}
