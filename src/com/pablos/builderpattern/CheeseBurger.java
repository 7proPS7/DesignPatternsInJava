package com.pablos.builderpattern;

public class CheeseBurger extends Burger {

	@Override
	public String name() {
		return "Cheese Burger";
	}

	@Override
	public float price() {
		return 20.0f;
	}

}
