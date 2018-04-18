package com.cy.entity;

import java.io.Serializable;
/**
 * 事项-dto
 实体类
 */

public class ProjectDto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3756203213237636577L;

	/**
     * 事项编号
     */
	private String c_project_id;

    /**
     * 父事项编号
     */
	private String v_project_pid;

    /**
     * 对应佛山编号
     */
	private String v_project_fsid;

    /**
     * 佛山大项编号
     */
	private String v_project_fsid1;

    /**
     * 佛山子项编号
     */
	private String v_project_fsid2;

    /**
     * 佛山大项名称
     */
	private String v_project_fspname;

    /**
     * 事项名称
     */
	private String v_project_name;

    /**
     * 属于佛山的部门
     */
	private String c_project_fsdept;

    /**
     * 业务组号
     */
	private String c_project_fsgroup;

    /**
     * 颁发的证件名称
     */
	private String v_project_certificate;

    /**
     * 证件的有效期
     */
	private String v_project_validity;

    /**
     * 审批类型及法律效力
     */
	private String v_project_efficaty;

    /**
     * 设定依据
     */
	private String v_project_gist;

    /**
     * 审批条件
     */
	private String v_project_conditions;

    /**
     * 审批受理机构名称
     */
	private String v_project_acceptdept;

    /**
     * 审批受理机构地点
     */
	private String v_project_acceptaddr;

    /**
     * 审批决定机关
     */
	private String v_project_decidedept;

    /**
     * 审批程序
     */
	private String v_project_process;

    /**
     * 镇流转到区方式（0-预受理；1-直接受理；2-镇办结）
     */
	private String c_project_next;

    /**
     * 村级承诺天数
     */
	private int i_project_cpromise;

    /**
     * 村受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	private String c_project_ctype;

    /**
     * 镇级承诺天数
     */
	private int i_project_zpromise;

    /**
     * 镇受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	private String c_project_ztype;

    /**
     * 区级承诺天数
     */
	private int i_project_qpromise;

    /**
     * 区受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	private String c_project_qtype;

    /**
     * 区外承诺天数
     */
	private int i_project_wpromise;

    /**
     * 承诺天数单位：G-工作日，Z-自然日
     */
	private String c_project_promiseunit;

    /**
     * 缺省收费金额
     */
	private float f_project_charge;

    /**
     * 收费银行
     */
	private String v_project_bank;

    /**
     * 收费依据
     */
	private String v_project_chargeby;

    /**
     * 年审或年检
     */
	private String v_project_year;

    /**
     * 备注
     */
	private String v_project_memo;

    /**
     * 佛山项目类型（农林、渔牧等）
     */
	private String c_project_sort;

    /**
     * 可用标志：0-不可用，1-可用公示，2-可用不公示
     */
	private String c_project_flag;

    /**
     * 取消流程
     */
	private String c_project_cancelflow;

    /**
     * 传送佛山承诺时间
     */
	private int i_project_fspromise;

    /**
     * 审批表格
     */
	private String v_project_forms;

    /**
     * 时限描述
     */
	private String v_project_promise;

    /**
     * 材料前描述
     */
	private String v_project_pre_data;

    /**
     * 事项等级
     */
	private int i_project_level;

    /**
     * 实施主体
     */
	private String v_project_practice;

    /**
     * 事项分类（A-行政许可；B-其他审批；C-日常管理；D-取消事项；Z-南海事项）
     */
	private String c_project_fstype;

    /**
     * 是否发佛山：0-不发，1-发（非重点事项），2-发（重点事项）
     */
	private String c_project_tofs;

    /**
     * 咨询投诉部门
     */
	private String v_project_referdept;

    /**
     * 咨询投诉电话
     */
	private String v_project_referphone;

    /**
     * 下放层级
     */
	private String c_project_downlevel;

    /**
     * 下放权限
     */
	private String c_project_downpermission;

    /**
     * 下放方式
     */
	private String c_project_downmode;

    /**
     * 网上办事模式
     */
	private String c_project_webmode;

    /**
     * 未知
     */
	private String v_project_fsid0;

    /**
     * 事项编号
     */
	public void setC_project_id(String c_project_id){
		this.c_project_id=c_project_id;
	}

    /**
     * 事项编号
     */
	public String getC_project_id(){
		return c_project_id;
	}

    /**
     * 父事项编号
     */
	public void setV_project_pid(String v_project_pid){
		this.v_project_pid=v_project_pid;
	}

    /**
     * 父事项编号
     */
	public String getV_project_pid(){
		return v_project_pid;
	}

    /**
     * 对应佛山编号
     */
	public void setV_project_fsid(String v_project_fsid){
		this.v_project_fsid=v_project_fsid;
	}

    /**
     * 对应佛山编号
     */
	public String getV_project_fsid(){
		return v_project_fsid;
	}

    /**
     * 佛山大项编号
     */
	public void setV_project_fsid1(String v_project_fsid1){
		this.v_project_fsid1=v_project_fsid1;
	}

    /**
     * 佛山大项编号
     */
	public String getV_project_fsid1(){
		return v_project_fsid1;
	}

    /**
     * 佛山子项编号
     */
	public void setV_project_fsid2(String v_project_fsid2){
		this.v_project_fsid2=v_project_fsid2;
	}

    /**
     * 佛山子项编号
     */
	public String getV_project_fsid2(){
		return v_project_fsid2;
	}

    /**
     * 佛山大项名称
     */
	public void setV_project_fspname(String v_project_fspname){
		this.v_project_fspname=v_project_fspname;
	}

    /**
     * 佛山大项名称
     */
	public String getV_project_fspname(){
		return v_project_fspname;
	}

    /**
     * 事项名称
     */
	public void setV_project_name(String v_project_name){
		this.v_project_name=v_project_name;
	}

    /**
     * 事项名称
     */
	public String getV_project_name(){
		return v_project_name;
	}

    /**
     * 属于佛山的部门
     */
	public void setC_project_fsdept(String c_project_fsdept){
		this.c_project_fsdept=c_project_fsdept;
	}

    /**
     * 属于佛山的部门
     */
	public String getC_project_fsdept(){
		return c_project_fsdept;
	}

    /**
     * 业务组号
     */
	public void setC_project_fsgroup(String c_project_fsgroup){
		this.c_project_fsgroup=c_project_fsgroup;
	}

    /**
     * 业务组号
     */
	public String getC_project_fsgroup(){
		return c_project_fsgroup;
	}

    /**
     * 颁发的证件名称
     */
	public void setV_project_certificate(String v_project_certificate){
		this.v_project_certificate=v_project_certificate;
	}

    /**
     * 颁发的证件名称
     */
	public String getV_project_certificate(){
		return v_project_certificate;
	}

    /**
     * 证件的有效期
     */
	public void setV_project_validity(String v_project_validity){
		this.v_project_validity=v_project_validity;
	}

    /**
     * 证件的有效期
     */
	public String getV_project_validity(){
		return v_project_validity;
	}

    /**
     * 审批类型及法律效力
     */
	public void setV_project_efficaty(String v_project_efficaty){
		this.v_project_efficaty=v_project_efficaty;
	}

    /**
     * 审批类型及法律效力
     */
	public String getV_project_efficaty(){
		return v_project_efficaty;
	}

    /**
     * 设定依据
     */
	public void setV_project_gist(String v_project_gist){
		this.v_project_gist=v_project_gist;
	}

    /**
     * 设定依据
     */
	public String getV_project_gist(){
		return v_project_gist;
	}

    /**
     * 审批条件
     */
	public void setV_project_conditions(String v_project_conditions){
		this.v_project_conditions=v_project_conditions;
	}

    /**
     * 审批条件
     */
	public String getV_project_conditions(){
		return v_project_conditions;
	}

    /**
     * 审批受理机构名称
     */
	public void setV_project_acceptdept(String v_project_acceptdept){
		this.v_project_acceptdept=v_project_acceptdept;
	}

    /**
     * 审批受理机构名称
     */
	public String getV_project_acceptdept(){
		return v_project_acceptdept;
	}

    /**
     * 审批受理机构地点
     */
	public void setV_project_acceptaddr(String v_project_acceptaddr){
		this.v_project_acceptaddr=v_project_acceptaddr;
	}

    /**
     * 审批受理机构地点
     */
	public String getV_project_acceptaddr(){
		return v_project_acceptaddr;
	}

    /**
     * 审批决定机关
     */
	public void setV_project_decidedept(String v_project_decidedept){
		this.v_project_decidedept=v_project_decidedept;
	}

    /**
     * 审批决定机关
     */
	public String getV_project_decidedept(){
		return v_project_decidedept;
	}

    /**
     * 审批程序
     */
	public void setV_project_process(String v_project_process){
		this.v_project_process=v_project_process;
	}

    /**
     * 审批程序
     */
	public String getV_project_process(){
		return v_project_process;
	}

    /**
     * 镇流转到区方式（0-预受理；1-直接受理；2-镇办结）
     */
	public void setC_project_next(String c_project_next){
		this.c_project_next=c_project_next;
	}

    /**
     * 镇流转到区方式（0-预受理；1-直接受理；2-镇办结）
     */
	public String getC_project_next(){
		return c_project_next;
	}

    /**
     * 村级承诺天数
     */
	public void setI_project_cpromise(int i_project_cpromise){
		this.i_project_cpromise=i_project_cpromise;
	}

    /**
     * 村级承诺天数
     */
	public int getI_project_cpromise(){
		return i_project_cpromise;
	}

    /**
     * 村受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public void setC_project_ctype(String c_project_ctype){
		this.c_project_ctype=c_project_ctype;
	}

    /**
     * 村受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public String getC_project_ctype(){
		return c_project_ctype;
	}

    /**
     * 镇级承诺天数
     */
	public void setI_project_zpromise(int i_project_zpromise){
		this.i_project_zpromise=i_project_zpromise;
	}

    /**
     * 镇级承诺天数
     */
	public int getI_project_zpromise(){
		return i_project_zpromise;
	}

    /**
     * 镇受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public void setC_project_ztype(String c_project_ztype){
		this.c_project_ztype=c_project_ztype;
	}

    /**
     * 镇受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public String getC_project_ztype(){
		return c_project_ztype;
	}

    /**
     * 区级承诺天数
     */
	public void setI_project_qpromise(int i_project_qpromise){
		this.i_project_qpromise=i_project_qpromise;
	}

    /**
     * 区级承诺天数
     */
	public int getI_project_qpromise(){
		return i_project_qpromise;
	}

    /**
     * 区受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public void setC_project_qtype(String c_project_qtype){
		this.c_project_qtype=c_project_qtype;
	}

    /**
     * 区受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public String getC_project_qtype(){
		return c_project_qtype;
	}

    /**
     * 区外承诺天数
     */
	public void setI_project_wpromise(int i_project_wpromise){
		this.i_project_wpromise=i_project_wpromise;
	}

    /**
     * 区外承诺天数
     */
	public int getI_project_wpromise(){
		return i_project_wpromise;
	}

    /**
     * 承诺天数单位：G-工作日，Z-自然日
     */
	public void setC_project_promiseunit(String c_project_promiseunit){
		this.c_project_promiseunit=c_project_promiseunit;
	}

    /**
     * 承诺天数单位：G-工作日，Z-自然日
     */
	public String getC_project_promiseunit(){
		return c_project_promiseunit;
	}

    /**
     * 缺省收费金额
     */
	public void setF_project_charge(float f_project_charge){
		this.f_project_charge=f_project_charge;
	}

    /**
     * 缺省收费金额
     */
	public float getF_project_charge(){
		return f_project_charge;
	}

    /**
     * 收费银行
     */
	public void setV_project_bank(String v_project_bank){
		this.v_project_bank=v_project_bank;
	}

    /**
     * 收费银行
     */
	public String getV_project_bank(){
		return v_project_bank;
	}

    /**
     * 收费依据
     */
	public void setV_project_chargeby(String v_project_chargeby){
		this.v_project_chargeby=v_project_chargeby;
	}

    /**
     * 收费依据
     */
	public String getV_project_chargeby(){
		return v_project_chargeby;
	}

    /**
     * 年审或年检
     */
	public void setV_project_year(String v_project_year){
		this.v_project_year=v_project_year;
	}

    /**
     * 年审或年检
     */
	public String getV_project_year(){
		return v_project_year;
	}

    /**
     * 备注
     */
	public void setV_project_memo(String v_project_memo){
		this.v_project_memo=v_project_memo;
	}

    /**
     * 备注
     */
	public String getV_project_memo(){
		return v_project_memo;
	}

    /**
     * 佛山项目类型（农林、渔牧等）
     */
	public void setC_project_sort(String c_project_sort){
		this.c_project_sort=c_project_sort;
	}

    /**
     * 佛山项目类型（农林、渔牧等）
     */
	public String getC_project_sort(){
		return c_project_sort;
	}

    /**
     * 可用标志：0-不可用，1-可用公示，2-可用不公示
     */
	public void setC_project_flag(String c_project_flag){
		this.c_project_flag=c_project_flag;
	}

    /**
     * 可用标志：0-不可用，1-可用公示，2-可用不公示
     */
	public String getC_project_flag(){
		return c_project_flag;
	}

    /**
     * 取消流程
     */
	public void setC_project_cancelflow(String c_project_cancelflow){
		this.c_project_cancelflow=c_project_cancelflow;
	}

    /**
     * 取消流程
     */
	public String getC_project_cancelflow(){
		return c_project_cancelflow;
	}

    /**
     * 传送佛山承诺时间
     */
	public void setI_project_fspromise(int i_project_fspromise){
		this.i_project_fspromise=i_project_fspromise;
	}

    /**
     * 传送佛山承诺时间
     */
	public int getI_project_fspromise(){
		return i_project_fspromise;
	}

    /**
     * 审批表格
     */
	public void setV_project_forms(String v_project_forms){
		this.v_project_forms=v_project_forms;
	}

    /**
     * 审批表格
     */
	public String getV_project_forms(){
		return v_project_forms;
	}

    /**
     * 时限描述
     */
	public void setV_project_promise(String v_project_promise){
		this.v_project_promise=v_project_promise;
	}

    /**
     * 时限描述
     */
	public String getV_project_promise(){
		return v_project_promise;
	}

    /**
     * 材料前描述
     */
	public void setV_project_pre_data(String v_project_pre_data){
		this.v_project_pre_data=v_project_pre_data;
	}

    /**
     * 材料前描述
     */
	public String getV_project_pre_data(){
		return v_project_pre_data;
	}

    /**
     * 事项等级
     */
	public void setI_project_level(int i_project_level){
		this.i_project_level=i_project_level;
	}

    /**
     * 事项等级
     */
	public int getI_project_level(){
		return i_project_level;
	}

    /**
     * 实施主体
     */
	public void setV_project_practice(String v_project_practice){
		this.v_project_practice=v_project_practice;
	}

    /**
     * 实施主体
     */
	public String getV_project_practice(){
		return v_project_practice;
	}

    /**
     * 事项分类（A-行政许可；B-其他审批；C-日常管理；D-取消事项；Z-南海事项）
     */
	public void setC_project_fstype(String c_project_fstype){
		this.c_project_fstype=c_project_fstype;
	}

    /**
     * 事项分类（A-行政许可；B-其他审批；C-日常管理；D-取消事项；Z-南海事项）
     */
	public String getC_project_fstype(){
		return c_project_fstype;
	}

    /**
     * 是否发佛山：0-不发，1-发（非重点事项），2-发（重点事项）
     */
	public void setC_project_tofs(String c_project_tofs){
		this.c_project_tofs=c_project_tofs;
	}

    /**
     * 是否发佛山：0-不发，1-发（非重点事项），2-发（重点事项）
     */
	public String getC_project_tofs(){
		return c_project_tofs;
	}

    /**
     * 咨询投诉部门
     */
	public void setV_project_referdept(String v_project_referdept){
		this.v_project_referdept=v_project_referdept;
	}

    /**
     * 咨询投诉部门
     */
	public String getV_project_referdept(){
		return v_project_referdept;
	}

    /**
     * 咨询投诉电话
     */
	public void setV_project_referphone(String v_project_referphone){
		this.v_project_referphone=v_project_referphone;
	}

    /**
     * 咨询投诉电话
     */
	public String getV_project_referphone(){
		return v_project_referphone;
	}

    /**
     * 下放层级
     */
	public void setC_project_downlevel(String c_project_downlevel){
		this.c_project_downlevel=c_project_downlevel;
	}

    /**
     * 下放层级
     */
	public String getC_project_downlevel(){
		return c_project_downlevel;
	}

    /**
     * 下放权限
     */
	public void setC_project_downpermission(String c_project_downpermission){
		this.c_project_downpermission=c_project_downpermission;
	}

    /**
     * 下放权限
     */
	public String getC_project_downpermission(){
		return c_project_downpermission;
	}

    /**
     * 下放方式
     */
	public void setC_project_downmode(String c_project_downmode){
		this.c_project_downmode=c_project_downmode;
	}

    /**
     * 下放方式
     */
	public String getC_project_downmode(){
		return c_project_downmode;
	}

    /**
     * 网上办事模式
     */
	public void setC_project_webmode(String c_project_webmode){
		this.c_project_webmode=c_project_webmode;
	}

    /**
     * 网上办事模式
     */
	public String getC_project_webmode(){
		return c_project_webmode;
	}

    /**
     * 未知
     */
	public void setV_project_fsid0(String v_project_fsid0){
		this.v_project_fsid0=v_project_fsid0;
	}

    /**
     * 未知
     */
	public String getV_project_fsid0(){
		return v_project_fsid0;
	}

}
