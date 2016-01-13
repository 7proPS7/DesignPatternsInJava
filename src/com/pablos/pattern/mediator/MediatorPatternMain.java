package com.pablos.pattern.mediator;

public class MediatorPatternMain {

	public static void main(String[] args) {
		User pwko = new User("Robert");
		User cj = new User("Cezary");

		pwko.sendMessage("Hi Cezary");
		cj.sendMessage("Hello! Robert");

	}

}
