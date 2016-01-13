package com.pablos.pattern.delegate;

public class Client {
	BusinessDelegate businesService;

	public Client(BusinessDelegate businesServer) {
		this.businesService = businesServer;
	}

	public void doTask() {
		businesService.doTask();
	}
}
