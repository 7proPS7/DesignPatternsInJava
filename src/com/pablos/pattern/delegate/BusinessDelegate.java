package com.pablos.pattern.delegate;

public class BusinessDelegate {
	private BusinessLookUp lookUpService = new BusinessLookUp();
	private BussinesService bussinesService;
	private String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public void doTask() {
		bussinesService = lookUpService.getBusinnesService(serviceType);
		bussinesService.doProcessing();
	}

}
