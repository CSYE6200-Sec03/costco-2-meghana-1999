package org.gdp;

public class ItemAPI {
private int serialNumber;
private double price;
private String name;
private String description;
public ItemAPI() {
	super();
	// TODO Auto-generated constructor stub
}
public ItemAPI(int serialNumber, double price, String name, String description) {
	super();
	this.serialNumber = serialNumber;
	this.price = price;
	this.name = name;
	this.description = description;
}
public int getSerialNumber() {
	return serialNumber;
}
public void setSerialNumber(int serialNumber) {
	this.serialNumber = serialNumber;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "serialNumber=" + serialNumber + ", price=" + price + ", name=" + name + ", description="
			+ description;
}

}
