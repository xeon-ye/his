package cn.honry.statistics.drug.deptLeadDrug.service;

import java.util.List;

import cn.honry.base.bean.model.BusinessDictionary;
import cn.honry.base.bean.model.DrugApplyout;
import cn.honry.base.bean.model.DrugApplyoutNow;
import cn.honry.base.bean.model.DrugInfo;
import cn.honry.base.bean.model.SysDepartment;
import cn.honry.base.service.BaseService;
import cn.honry.inner.vo.StatVo;

public interface DeptLeadDrugService extends BaseService<DrugApplyout>{
	/***
	 *  查询各科室领药记录
	 *@author tuchuanjiang
	 *@createDate ：2016年6月25日
	 *@version 1.0
	 * @param statVo 
	 * @throws Exception 
	 */
	List<DrugApplyoutNow> queryTableList(String startTime, String endTime,String drugDept, String drugxz, String drugName,String page,String rows, StatVo statVo) throws Exception;
	/***
	 *  查询各科室领药记录数
	 *@author tuchuanjiang
	 *@createDate ：2016年6月25日
	 *@version 1.0
	 * @param statVo 
	 */
	int queryTableListTotal(String stime, String etime,String drugDept, String drugxz, String drugName, StatVo statVo) throws Exception;
	/***
	 *  查询科室list
	 * @author  tuchuanjiang
	 * @createDate ：2016年6月25日
	 * @version 1.0
	 */
	List<SysDepartment> querydrugDept() throws Exception;
	/***
	 *  查询药品名称list
	 * @author  tuchuanjiang
	 * @createDate ：2016年6月25日
	 * @version 1.0
	 */
	List<DrugInfo> querydrugName() throws Exception;
	/***
	 *  查询药品性质list
	 * @author  tuchuanjiang
	 * @createDate ：2016年6月25日
	 * @version 1.0
	 */
	List<BusinessDictionary> querydrugxz() throws Exception;
	
	/***
	 *  查询最大最小时间
	 * @author  zhuxiaolu
	 * @createDate ：2016年6月25日
	 * @version 1.0
	 */
	StatVo findMaxMin() throws Exception;

}
