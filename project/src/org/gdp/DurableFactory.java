package org.gdp;

public class DurableFactory {

	private static Durable instance;
	
	private DurableFactory() {
		   instance = null;
	}
	
	public static synchronized ItemAPI getInstance(int serialNumber, double price,String name,String description, double weight, String units) {
		instance =  new Durable(serialNumber,price,name,description, weight, units);
		return instance;
	}
	
}
