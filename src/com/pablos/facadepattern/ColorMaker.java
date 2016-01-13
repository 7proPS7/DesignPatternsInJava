package com.pablos.facadepattern;

public class ColorMaker {
	private Color red;
	private Color blue;
	private Color orange;

	public ColorMaker() {
		red = new Red();
		blue = new Blue();
		orange = new Orange();
	}

	public void fillRed() {
		red.fill();
	}

	public void fillBlue() {
		blue.fill();
	}

	public void fillOrange() {
		orange.fill();
	}
}
