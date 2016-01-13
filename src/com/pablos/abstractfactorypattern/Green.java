package com.pablos.abstractfactorypattern;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("green inside Green::fill method");
	}

}
