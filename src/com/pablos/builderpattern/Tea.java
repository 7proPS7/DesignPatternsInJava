package com.pablos.builderpattern;

public class Tea extends HotDrink {
	@Override
	public String name() {
		return "Tea";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
