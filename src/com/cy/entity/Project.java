package com.cy.entity;

import java.io.Serializable;
/**
 * 事项 实体类
 */

public class Project implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7070274745120494694L;

	/**
     * 事项编号
     */
	private String projectId;

    /**
     * 父事项编号
     */
	private String pid;

    /**
     * 对应佛山编号
     */
	private String fsid;

    /**
     * 佛山大项编号
     */
	private String fsid1;

    /**
     * 佛山子项编号
     */
	private String fsid2;

    /**
     * 佛山大项名称
     */
	private String fspname;

    /**
     * 前缀*、☆、◇等
     */
	private String prefix;

    /**
     * 事项名称
     */
	private String name;

    /**
     * 属于佛山的部门
     */
	private String fsdept;

    /**
     * 业务组号
     */
	private String fsgroup;

    /**
     * 颁发的证件名称
     */
	private String certificate;

    /**
     * 证件的有效期
     */
	private String validity;

    /**
     * 审批类型及法律效力
     */
	private String efficaty;

    /**
     * 设定依据
     */
	private String gist;

    /**
     * 审批条件
     */
	private String conditions;

    /**
     * 审批受理机构名称
     */
	private String acceptDept;

    /**
     * 审批受理机构地点
     */
	private String acceptAddr;

    /**
     * 审批决定机关
     */
	private String decideDept;

    /**
     * 审批程序
     */
	private String process;

    /**
     * 镇流转到区方式（0-预受理；1-直接受理；2-镇办结）
     */
	private String next;

    /**
     * 村级承诺天数
     */
	private int cpromise;

    /**
     * 村受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	private String ctype;

    /**
     * 镇级承诺天数
     */
	private int zpromise;

    /**
     * 镇受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	private String ztype;

    /**
     * 区级承诺天数
     */
	private int qpromise;

    /**
     * 区受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	private String qtype;

    /**
     * 区外承诺天数
     */
	private int wpromise;

    /**
     * 承诺天数单位：G-工作日，Z-自然日
     */
	private String promiseUnit;

    /**
     * 缺省收费金额
     */
	private float charge;

    /**
     * 收费银行
     */
	private String bank;

    /**
     * 收费依据
     */
	private String chargeBy;

    /**
     * 年审或年检
     */
	private String year;

    /**
     * 备注
     */
	private String memo;

    /**
     * 佛山项目类型（农林、渔牧等）
     */
	private String sort;

    /**
     * 可用标志：0-不可用，1-可用公示，2-可用不公示
     */
	private String flag;

    /**
     * 取消流程
     */
	private String cancelFlow;

    /**
     * 传送佛山承诺时间
     */
	private int fspromise;

    /**
     * 审批表格
     */
	private String forms;

    /**
     * 时限描述
     */
	private String promise;

    /**
     * 材料前描述
     */
	private String preData;

    /**
     * 材料后描述
     */
	private String sufData;

    /**
     * 事项等级
     */
	private int projectLevel;

    /**
     * 事项分类（A-行政许可；B-其他审批；C-日常管理；D-取消事项；Z-南海事项）
     */
	private String fstype;

    /**
     * 实施主体
     */
	private String practice;

    /**
     * 是否发佛山：0-不发，1-发（非重点事项），2-发（重点事项）
     */
	private String tofs;

    /**
     * 原系统事项编号
     */
	private String oldId;

    /**
     * 咨询投诉部门
     */
	private String referDept;

    /**
     * 咨询投诉电话
     */
	private String referPhone;

    /**
     * 2级名称
     */
	private String name2;

    /**
     * 3级名称
     */
	private String name3;

    /**
     * 下放层级
     */
	private String downLevel;

    /**
     * 下放权限
     */
	private String downPermission;

    /**
     * 下放方式
     */
	private String downMode;

    /**
     * 网上办事模式
     */
	private String webMode;

    /**
     * 跳转链接
     */
	private String webUrl;

    /**
     * 综合窗口
     */
	private String compositeWindowId;

    /**
     * 事项编号
     */
	public void setProjectId(String projectId){
		this.projectId=projectId;
	}

    /**
     * 事项编号
     */
	public String getProjectId(){
		return projectId;
	}

    /**
     * 父事项编号
     */
	public void setPid(String pid){
		this.pid=pid;
	}

    /**
     * 父事项编号
     */
	public String getPid(){
		return pid;
	}

    /**
     * 对应佛山编号
     */
	public void setFsid(String fsid){
		this.fsid=fsid;
	}

    /**
     * 对应佛山编号
     */
	public String getFsid(){
		return fsid;
	}

    /**
     * 佛山大项编号
     */
	public void setFsid1(String fsid1){
		this.fsid1=fsid1;
	}

    /**
     * 佛山大项编号
     */
	public String getFsid1(){
		return fsid1;
	}

    /**
     * 佛山子项编号
     */
	public void setFsid2(String fsid2){
		this.fsid2=fsid2;
	}

    /**
     * 佛山子项编号
     */
	public String getFsid2(){
		return fsid2;
	}

    /**
     * 佛山大项名称
     */
	public void setFspname(String fspname){
		this.fspname=fspname;
	}

    /**
     * 佛山大项名称
     */
	public String getFspname(){
		return fspname;
	}

    /**
     * 前缀*、☆、◇等
     */
	public void setPrefix(String prefix){
		this.prefix=prefix;
	}

    /**
     * 前缀*、☆、◇等
     */
	public String getPrefix(){
		return prefix;
	}

    /**
     * 事项名称
     */
	public void setName(String name){
		this.name=name;
	}

    /**
     * 事项名称
     */
	public String getName(){
		return name;
	}

    /**
     * 属于佛山的部门
     */
	public void setFsdept(String fsdept){
		this.fsdept=fsdept;
	}

    /**
     * 属于佛山的部门
     */
	public String getFsdept(){
		return fsdept;
	}

    /**
     * 业务组号
     */
	public void setFsgroup(String fsgroup){
		this.fsgroup=fsgroup;
	}

    /**
     * 业务组号
     */
	public String getFsgroup(){
		return fsgroup;
	}

    /**
     * 颁发的证件名称
     */
	public void setCertificate(String certificate){
		this.certificate=certificate;
	}

    /**
     * 颁发的证件名称
     */
	public String getCertificate(){
		return certificate;
	}

    /**
     * 证件的有效期
     */
	public void setValidity(String validity){
		this.validity=validity;
	}

    /**
     * 证件的有效期
     */
	public String getValidity(){
		return validity;
	}

    /**
     * 审批类型及法律效力
     */
	public void setEfficaty(String efficaty){
		this.efficaty=efficaty;
	}

    /**
     * 审批类型及法律效力
     */
	public String getEfficaty(){
		return efficaty;
	}

    /**
     * 设定依据
     */
	public void setGist(String gist){
		this.gist=gist;
	}

    /**
     * 设定依据
     */
	public String getGist(){
		return gist;
	}

    /**
     * 审批条件
     */
	public void setConditions(String conditions){
		this.conditions=conditions;
	}

    /**
     * 审批条件
     */
	public String getConditions(){
		return conditions;
	}

    /**
     * 审批受理机构名称
     */
	public void setAcceptDept(String acceptDept){
		this.acceptDept=acceptDept;
	}

    /**
     * 审批受理机构名称
     */
	public String getAcceptDept(){
		return acceptDept;
	}

    /**
     * 审批受理机构地点
     */
	public void setAcceptAddr(String acceptAddr){
		this.acceptAddr=acceptAddr;
	}

    /**
     * 审批受理机构地点
     */
	public String getAcceptAddr(){
		return acceptAddr;
	}

    /**
     * 审批决定机关
     */
	public void setDecideDept(String decideDept){
		this.decideDept=decideDept;
	}

    /**
     * 审批决定机关
     */
	public String getDecideDept(){
		return decideDept;
	}

    /**
     * 审批程序
     */
	public void setProcess(String process){
		this.process=process;
	}

    /**
     * 审批程序
     */
	public String getProcess(){
		return process;
	}

    /**
     * 镇流转到区方式（0-预受理；1-直接受理；2-镇办结）
     */
	public void setNext(String next){
		this.next=next;
	}

    /**
     * 镇流转到区方式（0-预受理；1-直接受理；2-镇办结）
     */
	public String getNext(){
		return next;
	}

    /**
     * 村级承诺天数
     */
	public void setCpromise(int cpromise){
		this.cpromise=cpromise;
	}

    /**
     * 村级承诺天数
     */
	public int getCpromise(){
		return cpromise;
	}

    /**
     * 村受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public void setCtype(String ctype){
		this.ctype=ctype;
	}

    /**
     * 村受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public String getCtype(){
		return ctype;
	}

    /**
     * 镇级承诺天数
     */
	public void setZpromise(int zpromise){
		this.zpromise=zpromise;
	}

    /**
     * 镇级承诺天数
     */
	public int getZpromise(){
		return zpromise;
	}

    /**
     * 镇受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public void setZtype(String ztype){
		this.ztype=ztype;
	}

    /**
     * 镇受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public String getZtype(){
		return ztype;
	}

    /**
     * 区级承诺天数
     */
	public void setQpromise(int qpromise){
		this.qpromise=qpromise;
	}

    /**
     * 区级承诺天数
     */
	public int getQpromise(){
		return qpromise;
	}

    /**
     * 区受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public void setQtype(String qtype){
		this.qtype=qtype;
	}

    /**
     * 区受理类型（0-任意；1-即办；2-承诺；5-答复；6-报批）
     */
	public String getQtype(){
		return qtype;
	}

    /**
     * 区外承诺天数
     */
	public void setWpromise(int wpromise){
		this.wpromise=wpromise;
	}

    /**
     * 区外承诺天数
     */
	public int getWpromise(){
		return wpromise;
	}

    /**
     * 承诺天数单位：G-工作日，Z-自然日
     */
	public void setPromiseUnit(String promiseUnit){
		this.promiseUnit=promiseUnit;
	}

    /**
     * 承诺天数单位：G-工作日，Z-自然日
     */
	public String getPromiseUnit(){
		return promiseUnit;
	}

    /**
     * 缺省收费金额
     */
	public void setCharge(float charge){
		this.charge=charge;
	}

    /**
     * 缺省收费金额
     */
	public float getCharge(){
		return charge;
	}

    /**
     * 收费银行
     */
	public void setBank(String bank){
		this.bank=bank;
	}

    /**
     * 收费银行
     */
	public String getBank(){
		return bank;
	}

    /**
     * 收费依据
     */
	public void setChargeBy(String chargeBy){
		this.chargeBy=chargeBy;
	}

    /**
     * 收费依据
     */
	public String getChargeBy(){
		return chargeBy;
	}

    /**
     * 年审或年检
     */
	public void setYear(String year){
		this.year=year;
	}

    /**
     * 年审或年检
     */
	public String getYear(){
		return year;
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
     * 佛山项目类型（农林、渔牧等）
     */
	public void setSort(String sort){
		this.sort=sort;
	}

    /**
     * 佛山项目类型（农林、渔牧等）
     */
	public String getSort(){
		return sort;
	}

    /**
     * 可用标志：0-不可用，1-可用公示，2-可用不公示
     */
	public void setFlag(String flag){
		this.flag=flag;
	}

    /**
     * 可用标志：0-不可用，1-可用公示，2-可用不公示
     */
	public String getFlag(){
		return flag;
	}

    /**
     * 取消流程
     */
	public void setCancelFlow(String cancelFlow){
		this.cancelFlow=cancelFlow;
	}

    /**
     * 取消流程
     */
	public String getCancelFlow(){
		return cancelFlow;
	}

    /**
     * 传送佛山承诺时间
     */
	public void setFspromise(int fspromise){
		this.fspromise=fspromise;
	}

    /**
     * 传送佛山承诺时间
     */
	public int getFspromise(){
		return fspromise;
	}

    /**
     * 审批表格
     */
	public void setForms(String forms){
		this.forms=forms;
	}

    /**
     * 审批表格
     */
	public String getForms(){
		return forms;
	}

    /**
     * 时限描述
     */
	public void setPromise(String promise){
		this.promise=promise;
	}

    /**
     * 时限描述
     */
	public String getPromise(){
		return promise;
	}

    /**
     * 材料前描述
     */
	public void setPreData(String preData){
		this.preData=preData;
	}

    /**
     * 材料前描述
     */
	public String getPreData(){
		return preData;
	}

    /**
     * 材料后描述
     */
	public void setSufData(String sufData){
		this.sufData=sufData;
	}

    /**
     * 材料后描述
     */
	public String getSufData(){
		return sufData;
	}

    /**
     * 事项等级
     */
	public void setProjectLevel(int projectLevel){
		this.projectLevel=projectLevel;
	}

    /**
     * 事项等级
     */
	public int getProjectLevel(){
		return projectLevel;
	}

    /**
     * 事项分类（A-行政许可；B-其他审批；C-日常管理；D-取消事项；Z-南海事项）
     */
	public void setFstype(String fstype){
		this.fstype=fstype;
	}

    /**
     * 事项分类（A-行政许可；B-其他审批；C-日常管理；D-取消事项；Z-南海事项）
     */
	public String getFstype(){
		return fstype;
	}

    /**
     * 实施主体
     */
	public void setPractice(String practice){
		this.practice=practice;
	}

    /**
     * 实施主体
     */
	public String getPractice(){
		return practice;
	}

    /**
     * 是否发佛山：0-不发，1-发（非重点事项），2-发（重点事项）
     */
	public void setTofs(String tofs){
		this.tofs=tofs;
	}

    /**
     * 是否发佛山：0-不发，1-发（非重点事项），2-发（重点事项）
     */
	public String getTofs(){
		return tofs;
	}

    /**
     * 原系统事项编号
     */
	public void setOldId(String oldId){
		this.oldId=oldId;
	}

    /**
     * 原系统事项编号
     */
	public String getOldId(){
		return oldId;
	}

    /**
     * 咨询投诉部门
     */
	public void setReferDept(String referDept){
		this.referDept=referDept;
	}

    /**
     * 咨询投诉部门
     */
	public String getReferDept(){
		return referDept;
	}

    /**
     * 咨询投诉电话
     */
	public void setReferPhone(String referPhone){
		this.referPhone=referPhone;
	}

    /**
     * 咨询投诉电话
     */
	public String getReferPhone(){
		return referPhone;
	}

    /**
     * 2级名称
     */
	public void setName2(String name2){
		this.name2=name2;
	}

    /**
     * 2级名称
     */
	public String getName2(){
		return name2;
	}

    /**
     * 3级名称
     */
	public void setName3(String name3){
		this.name3=name3;
	}

    /**
     * 3级名称
     */
	public String getName3(){
		return name3;
	}

    /**
     * 下放层级
     */
	public void setDownLevel(String downLevel){
		this.downLevel=downLevel;
	}

    /**
     * 下放层级
     */
	public String getDownLevel(){
		return downLevel;
	}

    /**
     * 下放权限
     */
	public void setDownPermission(String downPermission){
		this.downPermission=downPermission;
	}

    /**
     * 下放权限
     */
	public String getDownPermission(){
		return downPermission;
	}

    /**
     * 下放方式
     */
	public void setDownMode(String downMode){
		this.downMode=downMode;
	}

    /**
     * 下放方式
     */
	public String getDownMode(){
		return downMode;
	}

    /**
     * 网上办事模式
     */
	public void setWebMode(String webMode){
		this.webMode=webMode;
	}

    /**
     * 网上办事模式
     */
	public String getWebMode(){
		return webMode;
	}

    /**
     * 跳转链接
     */
	public void setWebUrl(String webUrl){
		this.webUrl=webUrl;
	}

    /**
     * 跳转链接
     */
	public String getWebUrl(){
		return webUrl;
	}

    /**
     * 综合窗口
     */
	public void setCompositeWindowId(String compositeWindowId){
		this.compositeWindowId=compositeWindowId;
	}

    /**
     * 综合窗口
     */
	public String getCompositeWindowId(){
		return compositeWindowId;
	}

}
