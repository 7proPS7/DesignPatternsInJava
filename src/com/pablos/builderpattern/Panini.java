package com.pablos.builderpattern;

public abstract class Panini implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
