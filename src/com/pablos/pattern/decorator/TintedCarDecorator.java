package com.pablos.pattern.decorator;

public class TintedCarDecorator extends CarDecorator {

	public TintedCarDecorator(Car carDecorator) {
		super(carDecorator);
	}
	@Override
	public void show() {
		carDecorator.show();
		setTinedGlass(carDecorator);
	}

	private void setTinedGlass(Car carDecorator) {
		System.out.println("Glass Color: TINED");

	}
}
