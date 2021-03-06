package cn.honry.inpatient.inpatientNumber.dao;

import java.util.List;

import org.apache.struts2.convention.annotation.Namespace;

import cn.honry.base.bean.model.BusinessHospitalbed;
import cn.honry.base.bean.model.InpatientNumber;
import cn.honry.base.dao.EntityDao;

@SuppressWarnings({"all"})
public interface InpatientNumberDao extends EntityDao<InpatientNumber>{

	/**  
	 * @Description：  初始化
	 * @Author：zhangjin
	 * @CreateDate：2016-11-14
	 * @ModifyRmk：
	 * @param:   
	 * @version 1.0
	 */
	String getInpatientNumber();

	/**  
	 * @Description：  加载数据
	 * @Author：zhangjin
	 * @CreateDate：2016-11-14
	 * @ModifyRmk：
	 * @param:   
	 * @version 1.0getNumberList
	 */
	List<InpatientNumber> getNumberList(String medicalrecordId,
			String beganTime, String endTime,String page,String rows);

	/**  
	 * @Description：  加载数据总条数
	 * @Author：zhangjin
	 * @CreateDate：2016-11-14
	 * @ModifyRmk：
	 * @param:   
	 * @version 1.0getNumberList
	 */
	int getNumberTotal(String medicalrecordId, String beganTime,
			String endTime, String page, String rows);
	/**  
	 * @Description：获取床号
	 * @Author：zhangjin
	 * @CreateDate：2016-11-18
	 * @ModifyRmk：
	 * @param:   
	 * @version 1.0
	 */
	List<BusinessHospitalbed> getBedinfoId();

}
