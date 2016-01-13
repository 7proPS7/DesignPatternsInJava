package com.pablos.abstractfactorypattern;

public class Orange implements Color {

	@Override
	public void fill() {
		System.out.println("orange inside Orange::fill method");
	}

}
