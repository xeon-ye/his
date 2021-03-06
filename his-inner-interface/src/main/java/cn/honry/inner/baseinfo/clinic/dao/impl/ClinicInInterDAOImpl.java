package cn.honry.inner.baseinfo.clinic.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.honry.base.bean.model.Clinic;
import cn.honry.base.dao.impl.HibernateEntityDao;
import cn.honry.inner.baseinfo.clinic.dao.ClinicInInterDAO;

/**  
 *  
 * 接口：诊室
 * @Author：aizhonghua
 * @Author：aizhonghua
 * @CreateDate：2016-2-24 上午11:56:31  
 * @Modifier：aizhonghua
 * @ModifyDate：2016-2-24 上午11:56:31  
 * @ModifyRmk：  
 * @version 1.0
 *
 */
@Repository("clinicInInterDAO")
public class ClinicInInterDAOImpl extends HibernateEntityDao<Clinic> implements ClinicInInterDAO{
	
	/**为父类HibernateDaoSupport注入sessionFactory的值**/
	@Resource(name = "sessionFactory")
	public void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
}
