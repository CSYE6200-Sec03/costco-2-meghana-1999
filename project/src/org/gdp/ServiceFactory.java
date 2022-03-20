package org.gdp;

public class ServiceFactory {
	private static final Service instance =new Service();
	   private ServiceFactory() {}
	   
	   
	   public static Service getInstance() {
		   return instance;
		}
	}

