package com.pablos.pattern.decorator;

public class DarkRedCarDecorator extends CarDecorator {

	public DarkRedCarDecorator(Car carDecorator) {
		super(carDecorator);
	}

	@Override
	public void show() {
		carDecorator.show();
		setDarkRedBody(carDecorator);
	}

	private void setDarkRedBody(Car carDecorator) {
		System.out.println("Body color: DARK RED");
	}

}
