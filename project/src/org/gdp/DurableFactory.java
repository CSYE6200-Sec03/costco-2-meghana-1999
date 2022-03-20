package org.gdp;

public class DurableFactory {
private static Durable instance;
	
	private DurableFactory() {
		   instance = null;
	}
	
	public static synchronized Durable getInstance() {
	if (instance == null) {
			instance =  new Durable();
		}
		return instance;
	}
	
}
