package org.gdp;

public class ServiceFactory {
	
	   private static Service instance =new Service();
	   private ServiceFactory() {}
	   
	   public static ItemAPI getInstance(int serialNumber, double price,String name, String description, String startTime,String endTime,String units) {
		   instance=new Service( serialNumber, price,name,description,startTime,endTime, units);
		   return instance;
		}
	}
