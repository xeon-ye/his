package cn.honry.base.bean.model;
import java.util.Date;
import cn.honry.base.bean.business.Entity;

/**  
 *  
 * @Description：  设备条码管理
 * @Author：zpty
 * @CreateDate：2017-11-14 上午09:35:05  
 *
 */
public class AssetsDeviceCode extends Entity{

	
	private static final long serialVersionUID = 1L;

	/** 办公用途编码   **/
	private String officeCode;
	/** 办公用途名称   **/
	private String officeName;
	/** 设备分类编码   **/
	private String classCode;
	/** 设备分类名称   **/
	private String className;
	/** 设备条码号   **/
	private String deviceNo;
	/** 设备代码   **/
	private String deviceCode;
	/** 设备名称   **/
	private String deviceName;
	/** 计量单位   **/
	private String meterUnit;
	/**采购单价(元)*/
	private Double purchPrice = 0.0;
	/** 入库时间 **/
	private Date deviceDate;
	/** 状态(0未打印1已打印) **/
	private Integer state=0;
	
	/** 页数   **/
	private String page;
	/**  每页行数  **/
	private String rows;
	
	//新加字段
	/** 领用标记(0未领用1已领用) **/
	private Integer useFlg=0;
	
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getDeviceNo() {
		return deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getMeterUnit() {
		return meterUnit;
	}
	public void setMeterUnit(String meterUnit) {
		this.meterUnit = meterUnit;
	}
	public Double getPurchPrice() {
		return purchPrice;
	}
	public void setPurchPrice(Double purchPrice) {
		this.purchPrice = purchPrice;
	}
	public Date getDeviceDate() {
		return deviceDate;
	}
	public void setDeviceDate(Date deviceDate) {
		this.deviceDate = deviceDate;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getRows() {
		return rows;
	}
	public void setRows(String rows) {
		this.rows = rows;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getUseFlg() {
		return useFlg;
	}
	public void setUseFlg(Integer useFlg) {
		this.useFlg = useFlg;
	}
	
}