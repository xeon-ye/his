package cn.honry.base.bean.model;

import java.util.Date;

import cn.honry.base.bean.business.Entity;
/**
 * 手术申请单
 * @author zhangjin
 * @CreateDate：2016-04-11 
 *
 */
public class OperationApply extends Entity{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 住院流水号门诊卡号
	 */
	private String clinicCode;
	/**
	 * 病历号
	 */
	private String patientNo;
	/**
	 * 来源
	 */
	private Integer pasource;
	/**
	 * 患者姓名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 出生日期
	 */
	private Date birthday;
	/**
	 * 职业
	 */
	private String profession;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 联系电话
	 */
	private String telephone;
	/**
	 * 住院科室
	 */
	private String inDept;
	/**
	 * 病房号
	 */
	private String wardNo;
	/**
	 * 病床号
	 */
	private String bedNo;
	/**
	 * 患者血型
	 */
	private String bloodCode;
	/**
	 * 手术分类    择期、急诊、感染、门诊
	 */
	private String opType;
	/**
	 * 手术医生编码
	 */
	private String opDoctor;
	/**
	 * 手术医生科室编码
	 */
	private String opDoctordept;
	/**
	 * 指导医生编码
	 */
	private String guiDoctor;
	/**
	 * 预约时间
	 */
	private Date preDate;
	/**
	 * 预定用时
	 */
	private String duration;
	/**
	 * 麻醉类型
	 */
	private String anesType;
	/**
	 * 麻醉方式
	 */
	private String aneWay;
	/**
	 * 麻醉注意事项
	 */
	private String aneNote;
	/**
	 * 申请医生编码
	 */
	private String applyDoctor;
	/**
	 * 申请备注
	 */
	private String applyRemark;
	/**
	 * 一级审批医生编码
	 */
	private String apprDoctor;
	/**
	 * 一级审批时间
	 */
	private Date apprDate;
	/**
	 * 一级审批备注
	 */
	private String apprRemark;
	/**
	 * 二级审批备注
	 */
	private String apprDoctor2;
	/**
	 * 二级审批时间
	 */
	private Date apprDate2;
	/**
	 * 二级审批备注
	 */
	private String apprRemark2;
	/**
	 * 三级审批备注
	 */
	private String apprDoctor3;
	/**
	 * 三级审批时间
	 */
	private Date apprDate3;
	/**
	 * 三级审批备注
	 */
	private String apprRemark3;
	/**
	 * 手术规模
	 */
	private String degree;
	/**
	 * 切口类型
	 */
	private String inciType;
	/**
	 * 感染类型
	 */
	private String infectType;
	/**
	 * 1 有菌 0无菌
	 */
	private Integer isgerm;
	/**
	 * 手术注意事项
	 */
	private String opsNote;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 是否已做
	 */
	private Integer isfinished;
	/**
	 * 签字家属
	 */
	private String folk;
	/**
	 * 家属关系
	 */
	private String relaCode;
	/**
	 * 家属意见
	 */
	private String folkComment;
	/**
	 * 是否加急
	 */
	private Integer isurgent;
	/**
	 * 是否已计费
	 */
	private Integer ischange;
	/**
	 * 是否重症
	 */
	private Integer isheavy;
	/**
	 * 是否特殊手术
	 */
	private Integer isspecial;
	/**
	 * 是否合并
	 */
	private Integer isunite;
	/**
	 * 合并后手术编号
	 */
	private String uniteOpid;
	/**
	 * 合并疾病
	 */
	private String uniteDisease;
	/**
	 * 是否需要随台护士
	 */
	private Integer isneedacco;
	/**
	 * 随台护士数
	 */
	private Integer accoNurse;
	/**
	 * 助手数
	 */
	private Integer helperNum;
	/**
	 * 洗手护士数
	 */
	private Integer washNurse;
	/**
	 * 是否需要巡回护士
	 */
	private Integer isneedprep;
	/**
	 * 巡回护士数
	 */
	private Integer prepNurse;
	/**
	 * 是否需要病理检查
	 */
	private Integer isneedpathology;
	/**
	 * 是否自体血回输
	 */
	private Integer isautoblood;
	/**
	 * 多重耐药
	 */
	private Integer dcny;
	/**
	 * 手术体位
	 */
	private Integer opertionposition;
	/**
	 * 是否二次手术
	 */
	private Integer issecondopertion;
	/**
	 * 是否同意使用自费项目
	 */
	private Integer isownexpense;
	/**
	 * 临床表现
	 */
	private String clinical;
	/**
	 * 手术禁忌症
	 */
	private String contraindication;
	/**
	 * 手术适应症
	 */
	private String indication;
	/**
	 * 目前病人情况
	 */
	private String stitution;
	/**
	 * 术前准备情况
	 */
	private String preparation;
	/**
	 * 可能的并发症
	 */
	private String complication;
	/**
	 * 术前讨论情况
	 */
	private String discussion;
	/**
	 * 术中术后应对措施
	 */
	private String measures;
	/**
	 * 是否请上级医院会诊
	 */
	private String isgroupconsultation;
	/**
	 * 手术间   **  新加字段
	 */
	private String roomId;
	/**
	 * 手术台
	 */
	private String console;
	/**
	 * 手术台类型
	 */
	private String consoleType;
	/**
	 * 是否麻醉
	 */
	private Integer isane;
	/**
	 * 是否收费
	 */
	private String ynfee;
	/**
	 * 以下虚拟字段 与数据库无关
	 */
	
	/**
	 * 开始时间
	 */
	private String beganTime;
	/**
	 * 结束时间
	 */
	private String endTime;
	/**
	 * 手术类别
	 */
	private String arrangeType;
	
	/**
	 * 执行科室
	 */
	private String execDept;
	
	/**
	 * 申请时间
	 */
	private Date applyDate;
	
	/**
	 * 年龄单位
	 */
	private String ageUnit;
	
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getClinicCode() {
		return clinicCode;
	}
	public void setClinicCode(String clinicCode) {
		this.clinicCode = clinicCode;
	}
	public String getConsoleType() {
		return consoleType;
	}
	public void setConsoleType(String consoleType) {
		this.consoleType = consoleType;
	}
	public Integer getIsane() {
		return isane;
	}
	public void setIsane(Integer isane) {
		this.isane = isane;
	}
	public String getPatientNo() {
		return patientNo;
	}
	public void setPatientNo(String patientNo) {
		this.patientNo = patientNo;
	}
	public Integer getPasource() {
		return pasource;
	}
	public void setPasource(Integer pasource) {
		this.pasource = pasource;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getInDept() {
		return inDept;
	}
	public void setInDept(String inDept) {
		this.inDept = inDept;
	}
	public String getWardNo() {
		return wardNo;
	}
	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}
	public String getBedNo() {
		return bedNo;
	}
	public void setBedNo(String bedNo) {
		this.bedNo = bedNo;
	}
	public String getBloodCode() {
		return bloodCode;
	}
	public void setBloodCode(String bloodCode) {
		this.bloodCode = bloodCode;
	}
	
	public String getOpType() {
		return opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}
	public String getOpDoctor() {
		return opDoctor;
	}
	public void setOpDoctor(String opDoctor) {
		this.opDoctor = opDoctor;
	}
	public String getOpDoctordept() {
		return opDoctordept;
	}
	public void setOpDoctordept(String opDoctordept) {
		this.opDoctordept = opDoctordept;
	}
	public String getGuiDoctor() {
		return guiDoctor;
	}
	public void setGuiDoctor(String guiDoctor) {
		this.guiDoctor = guiDoctor;
	}
	public Date getPreDate() {
		return preDate;
	}
	public void setPreDate(Date preDate) {
		this.preDate = preDate;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Integer getHelperNum() {
		return helperNum;
	}
	public void setHelperNum(Integer helperNum) {
		this.helperNum = helperNum;
	}
	public Integer getWashNurse() {
		return washNurse;
	}
	public void setWashNurse(Integer washNurse) {
		this.washNurse = washNurse;
	}
	public Integer getAccoNurse() {
		return accoNurse;
	}
	public void setAccoNurse(Integer accoNurse) {
		this.accoNurse = accoNurse;
	}
	public Integer getPrepNurse() {
		return prepNurse;
	}
	public void setPrepNurse(Integer prepNurse) {
		this.prepNurse = prepNurse;
	}
	public String getAnesType() {
		return anesType;
	}
	public void setAnesType(String anesType) {
		this.anesType = anesType;
	}
	public String getAneWay() {
		return aneWay;
	}
	public void setAneWay(String aneWay) {
		this.aneWay = aneWay;
	}
	public String getAneNote() {
		return aneNote;
	}
	public void setAneNote(String aneNote) {
		this.aneNote = aneNote;
	}
	
	public String getApplyDoctor() {
		return applyDoctor;
	}
	public void setApplyDoctor(String applyDoctor) {
		this.applyDoctor = applyDoctor;
	}
	public String getApplyRemark() {
		return applyRemark;
	}
	public void setApplyRemark(String applyRemark) {
		this.applyRemark = applyRemark;
	}
	public String getApprDoctor() {
		return apprDoctor;
	}
	public void setApprDoctor(String apprDoctor) {
		this.apprDoctor = apprDoctor;
	}
	public Date getApprDate() {
		return apprDate;
	}
	public void setApprDate(Date apprDate) {
		this.apprDate = apprDate;
	}
	public String getApprRemark() {
		return apprRemark;
	}
	public void setApprRemark(String apprRemark) {
		this.apprRemark = apprRemark;
	}
	public String getApprDoctor2() {
		return apprDoctor2;
	}
	public void setApprDoctor2(String apprDoctor2) {
		this.apprDoctor2 = apprDoctor2;
	}
	public Date getApprDate2() {
		return apprDate2;
	}
	public void setApprDate2(Date apprDate2) {
		this.apprDate2 = apprDate2;
	}
	public String getApprRemark2() {
		return apprRemark2;
	}
	public void setApprRemark2(String apprRemark2) {
		this.apprRemark2 = apprRemark2;
	}
	public String getApprDoctor3() {
		return apprDoctor3;
	}
	public void setApprDoctor3(String apprDoctor3) {
		this.apprDoctor3 = apprDoctor3;
	}
	public Date getApprDate3() {
		return apprDate3;
	}
	public void setApprDate3(Date apprDate3) {
		this.apprDate3 = apprDate3;
	}
	public String getApprRemark3() {
		return apprRemark3;
	}
	public void setApprRemark3(String apprRemark3) {
		this.apprRemark3 = apprRemark3;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getInciType() {
		return inciType;
	}
	public void setInciType(String inciType) {
		this.inciType = inciType;
	}
	public String getInfectType() {
		return infectType;
	}
	public void setInfectType(String infectType) {
		this.infectType = infectType;
	}
	public Integer getIsgerm() {
		return isgerm;
	}
	public void setIsgerm(Integer isgerm) {
		this.isgerm = isgerm;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public String getOpsNote() {
		return opsNote;
	}
	public void setOpsNote(String opsNote) {
		this.opsNote = opsNote;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getIsfinished() {
		return isfinished;
	}
	public void setIsfinished(Integer isfinished) {
		this.isfinished = isfinished;
	}
	public String getFolk() {
		return folk;
	}
	public void setFolk(String folk) {
		this.folk = folk;
	}
	public String getRelaCode() {
		return relaCode;
	}
	public void setRelaCode(String relaCode) {
		this.relaCode = relaCode;
	}
	public String getFolkComment() {
		return folkComment;
	}
	public void setFolkComment(String folkComment) {
		this.folkComment = folkComment;
	}
	public Integer getIsurgent() {
		return isurgent;
	}
	public void setIsurgent(Integer isurgent) {
		this.isurgent = isurgent;
	}
	public Integer getIschange() {
		return ischange;
	}
	public void setIschange(Integer ischange) {
		this.ischange = ischange;
	}
	public Integer getIsheavy() {
		return isheavy;
	}
	public void setIsheavy(Integer isheavy) {
		this.isheavy = isheavy;
	}
	public Integer getIsspecial() {
		return isspecial;
	}
	public void setIsspecial(Integer isspecial) {
		this.isspecial = isspecial;
	}
	public Integer getIsunite() {
		return isunite;
	}
	public void setIsunite(Integer isunite) {
		this.isunite = isunite;
	}
	public String getUniteOpid() {
		return uniteOpid;
	}
	public void setUniteOpid(String uniteOpid) {
		this.uniteOpid = uniteOpid;
	}
	public String getUniteDisease() {
		return uniteDisease;
	}
	public void setUniteDisease(String uniteDisease) {
		this.uniteDisease = uniteDisease;
	}
	public Integer getIsneedacco() {
		return isneedacco;
	}
	public void setIsneedacco(Integer isneedacco) {
		this.isneedacco = isneedacco;
	}
	public Integer getIsneedprep() {
		return isneedprep;
	}
	public void setIsneedprep(Integer isneedprep) {
		this.isneedprep = isneedprep;
	}
	public Integer getIsneedpathology() {
		return isneedpathology;
	}
	public void setIsneedpathology(Integer isneedpathology) {
		this.isneedpathology = isneedpathology;
	}
	public Integer getIsautoblood() {
		return isautoblood;
	}
	public void setIsautoblood(Integer isautoblood) {
		this.isautoblood = isautoblood;
	}
	public Integer getDcny() {
		return dcny;
	}
	public void setDcny(Integer dcny) {
		this.dcny = dcny;
	}
	public Integer getOpertionposition() {
		return opertionposition;
	}
	public void setOpertionposition(Integer opertionposition) {
		this.opertionposition = opertionposition;
	}
	public Integer getIssecondopertion() {
		return issecondopertion;
	}
	public void setIssecondopertion(Integer issecondopertion) {
		this.issecondopertion = issecondopertion;
	}
	public Integer getIsownexpense() {
		return isownexpense;
	}
	public void setIsownexpense(Integer isownexpense) {
		this.isownexpense = isownexpense;
	}
	public String getClinical() {
		return clinical;
	}
	public void setClinical(String clinical) {
		this.clinical = clinical;
	}
	public String getContraindication() {
		return contraindication;
	}
	public void setContraindication(String contraindication) {
		this.contraindication = contraindication;
	}
	public String getIndication() {
		return indication;
	}
	public void setIndication(String indication) {
		this.indication = indication;
	}
	public String getStitution() {
		return stitution;
	}
	public void setStitution(String stitution) {
		this.stitution = stitution;
	}
	public String getPreparation() {
		return preparation;
	}
	public void setPreparation(String preparation) {
		this.preparation = preparation;
	}
	public String getComplication() {
		return complication;
	}
	public void setComplication(String complication) {
		this.complication = complication;
	}
	public String getDiscussion() {
		return discussion;
	}
	public void setDiscussion(String discussion) {
		this.discussion = discussion;
	}
	public String getMeasures() {
		return measures;
	}
	public void setMeasures(String measures) {
		this.measures = measures;
	}
	public String getIsgroupconsultation() {
		return isgroupconsultation;
	}
	public void setIsgroupconsultation(String isgroupconsultation) {
		this.isgroupconsultation = isgroupconsultation;
	}
	public String getBeganTime() {
		return beganTime;
	}
	public void setBeganTime(String beganTime) {
		this.beganTime = beganTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getArrangeType() {
		return arrangeType;
	}
	public void setArrangeType(String arrangeType) {
		this.arrangeType = arrangeType;
	}
	public String getExecDept() {
		return execDept;
	}
	public void setExecDept(String execDept) {
		this.execDept = execDept;
	}
	public Date getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	public String getAgeUnit() {
		return ageUnit;
	}
	public void setAgeUnit(String ageUnit) {
		this.ageUnit = ageUnit;
	}
	public String getYnfee() {
		return ynfee;
	}
	public void setYnfee(String ynfee) {
		this.ynfee = ynfee;
	}
	
}
