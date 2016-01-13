package com.pablos.abstractfactorypattern;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("blue inside Blue::fill method");
	}

}
