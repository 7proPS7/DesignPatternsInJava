package com.pablos.bridgepattern;

public class BlueCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Draw Circle [ color: blue, radius: " + radius + ", x: " + x + ", y: " + y + " ]");
	}
}
