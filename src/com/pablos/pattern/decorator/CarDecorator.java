package com.pablos.pattern.decorator;

public abstract class CarDecorator implements Car {
	protected Car carDecorator;

	public CarDecorator(Car carDecorator) {
		this.carDecorator = carDecorator;
	}

	public void show() {
		carDecorator.show();
	}

}
