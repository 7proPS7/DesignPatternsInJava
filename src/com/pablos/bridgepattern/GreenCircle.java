package com.pablos.bridgepattern;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Draw Circle [ color: green, radius: " + radius + ", x: " + x + ", y: " + y + " ]");
	}

}
