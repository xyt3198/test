package com.cy.entity;

import java.io.Serializable;
/**
 * 依据 实体类
 */

public class BzhMatterBasis implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3748646865989040580L;

	/**
     * ID
     */
	private String id;

    /**
     * 情形ID
     */
	private String service_id;

    /**
     * 基本服务ID
     */
	private String servicebasis_id;

    /**
     * 类型
     */
	private String species;

    /**
     * 依据序号
     */
	private String bind_sort;

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
	public void setService_id(String service_id){
		this.service_id=service_id;
	}

    /**
     * 情形ID
     */
	public String getService_id(){
		return service_id;
	}

    /**
     * 基本服务ID
     */
	public void setServicebasis_id(String servicebasis_id){
		this.servicebasis_id=servicebasis_id;
	}

    /**
     * 基本服务ID
     */
	public String getServicebasis_id(){
		return servicebasis_id;
	}

    /**
     * 类型
     */
	public void setSpecies(String species){
		this.species=species;
	}

    /**
     * 类型
     */
	public String getSpecies(){
		return species;
	}

    /**
     * 依据序号
     */
	public void setBind_sort(String bind_sort){
		this.bind_sort=bind_sort;
	}

    /**
     * 依据序号
     */
	public String getBind_sort(){
		return bind_sort;
	}

}
