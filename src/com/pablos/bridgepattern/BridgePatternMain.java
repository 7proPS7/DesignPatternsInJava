package com.pablos.bridgepattern;

public class BridgePatternMain {

	public static void main(String[] args) {
		Shape redCircle = new Circle(new RedCircle(), 5, 50, 50);
		Shape greenCircle = new Circle(new GreenCircle(), 10, 100, 100);
		Shape blueCircle = new Circle(new BlueCircle(), 20, 200, 200);

		redCircle.draw();
		greenCircle.draw();
		blueCircle.draw();
	}

}
