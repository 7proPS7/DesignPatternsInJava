package com.pablos.bridgepattern;

public class Circle extends Shape {
	private int radius, x, y;

	protected Circle(DrawAPI drawAPI, int radius, int x, int y) {
		super(drawAPI);
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
