package com.pablos.pattern.delegate;

public class JMSService implements BussinesService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}
}
