package com.pablos.pattern.decorator;

public class BlackCarDecorator extends CarDecorator {

	public BlackCarDecorator(Car carDecorator) {
		super(carDecorator);
	}

	@Override
	public void show() {
		carDecorator.show();
		setBlackTire(carDecorator);
	}

	private void setBlackTire(Car carDecorator) {
		System.out.println("Tire Color: BLACK");

	}

}
