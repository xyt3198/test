package com.cy.entity;

import java.io.Serializable;
/**
 * 条款 实体类
 */

public class BzhClause implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5395745924976051227L;

	/**
     * 条款ID
     */
	private String clauseId;

    /**
     * 未知
     */
	private String basisId;

    /**
     * 基础条例名称
     */
	private String basisName;

    /**
     * 序号
     */
	private String sort;

    /**
     * 条款标题
     */
	private String clauseNum;

    /**
     * 条款内容
     */
	private String clauseContent;

    /**
     * 依据ID
     */
	private String matterBasicId;

    /**
     * 条款ID
     */
	public void setClauseId(String clauseId){
		this.clauseId=clauseId;
	}

    /**
     * 条款ID
     */
	public String getClauseId(){
		return clauseId;
	}

    /**
     * 未知
     */
	public void setBasisId(String basisId){
		this.basisId=basisId;
	}

    /**
     * 未知
     */
	public String getBasisId(){
		return basisId;
	}

    /**
     * 基础条例名称
     */
	public void setBasisName(String basisName){
		this.basisName=basisName;
	}

    /**
     * 基础条例名称
     */
	public String getBasisName(){
		return basisName;
	}

    /**
     * 序号
     */
	public void setSort(String sort){
		this.sort=sort;
	}

    /**
     * 序号
     */
	public String getSort(){
		return sort;
	}

    /**
     * 条款标题
     */
	public void setClauseNum(String clauseNum){
		this.clauseNum=clauseNum;
	}

    /**
     * 条款标题
     */
	public String getClauseNum(){
		return clauseNum;
	}

    /**
     * 条款内容
     */
	public void setClauseContent(String clauseContent){
		this.clauseContent=clauseContent;
	}

    /**
     * 条款内容
     */
	public String getClauseContent(){
		return clauseContent;
	}

    /**
     * 依据ID
     */
	public void setMatterBasicId(String matterBasicId){
		this.matterBasicId=matterBasicId;
	}

    /**
     * 依据ID
     */
	public String getMatterBasicId(){
		return matterBasicId;
	}

}
