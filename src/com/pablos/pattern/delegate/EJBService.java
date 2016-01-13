package com.pablos.pattern.delegate;

public class EJBService implements BussinesService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}
}
