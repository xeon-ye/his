package cn.honry.statistics.bi.bistac.deptAndFeeData.vo;

public class StatisticsVo {
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 值
	 */
	private Double value = 0.0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
