package com.pablos.builderpattern;

public class Coffee extends HotDrink {
	@Override
	public String name() {
		return "Coffee";
	}

	@Override
	public float price() {
		return 40.0f;
	}

}
