package cn.honry.mobile.exceptionLog.dao;

import net.sf.json.JSONArray;
import cn.honry.base.bean.model.RecordToMobileException;

public interface ExceptionLogDao {

	JSONArray getHIASExceptionByPage(String page, String rows,
			RecordToMobileException hiasException);

	Long getTotalByPage(RecordToMobileException hiasException);

	void saveExceptionInfoToMongo(RecordToMobileException hiasException,
			Exception e);

	void startDeal(String id);

	void endDeal(String id);

}
