package org.gdp;

public class Service extends ItemAPI {
	private String startTime;
	private String endTime;
	private String timeUnits;
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(int serialNumber, double price, String name, String description, String startTime2, String endTime2, String units) {
		super(serialNumber, price, name, description);
		// TODO Auto-generated constructor stub
	}
	public Service(String startTime, String endTime, String timeUnits) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.timeUnits = timeUnits;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getTimeUnits() {
		return timeUnits;
	}
	public void setTimeUnits(String timeUnits) {
		this.timeUnits = timeUnits;
	}
	@Override
	public String toString() {
		return "SerialNumber" + getSerialNumber() + ",\t\tPrice=" + getPrice() + ",\tName=" + getName()
		+ ",\tDescription=" + getDescription()+ ",\tstartTime=" + startTime + ",\tendTime=" + endTime + ",\ttimeUnits=" + timeUnits;
}

}
