package cn.honry.statistics.deptstat.deathPatient.dao;

import java.util.List;

import cn.honry.base.dao.EntityDao;
import cn.honry.statistics.deptstat.deathPatient.vo.DeathPatientVo;

public interface DeathPatientDao extends EntityDao<DeathPatientVo>{
	/**  
	 * 
	 * 患者死亡信息统计
	 * @Author: wangshujuan
	 * @CreateDate: 2017年11月14日 下午4:09:43 
	 * @Modifier: wangshujuan
	 * @ModifyDate: 2017年11月14日 下午4:09:43 
	 * @ModifyRmk:  
	 * @version: V1.0
	 * @param deptCode 
	 *
	 */
	public List<DeathPatientVo> queryDeathPatient(String startTime,String endTime, String deptCode,String sex, String menuAlias,String page,String rows);

	/**  
	 * 
	 * 患者死亡信息统计  总条数
	 * @Author: wangshujuan
	 * @CreateDate: 2017年11月14日 下午4:09:43 
	 * @Modifier: wangshujuan
	 * @ModifyDate: 2017年11月14日 下午4:09:43 
	 * @ModifyRmk:  
	 * @version: V1.0
	 * @param deptCode 
	 *
	 */
	public int getTotalDeathPatient(String startTime, String endTime,String deptCode,String sex, String menuAlias);
}
