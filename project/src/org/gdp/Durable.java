package org.gdp;

public class Durable extends ItemAPI{
	private double weight;
	private String units;
	public Durable() {
		super();
	}
	public Durable(int serialNumber, double price, String name, String description) {
		super(serialNumber, price, name, description);
	}
	public Durable(double weight, String units) {
		super();
		this.weight = weight;
		this.units = units;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	@Override
	public String toString() {
		return "Serial Number=" + getSerialNumber()+ ",\tPrice=" + getPrice() + ",\tName=" + getName() + ",\tDescription=" + getDescription() +"\t\tWeight=" + weight + ",\tUnits=" + units;
	
	}
	

}
