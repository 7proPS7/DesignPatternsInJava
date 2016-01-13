package com.pablos.pattern.delegate;

public class BusinessLookUp {
	public BussinesService getBusinnesService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB"))
			return new EJBService();
		else
			return new JMSService();
	}
}
