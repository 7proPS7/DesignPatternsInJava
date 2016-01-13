package com.pablos.factorypattern;

public class FactoryPatternMain {

	public static void main(String[] args) {
		Shapefactory shapefactory = new Shapefactory();

		Shape sqshape = shapefactory.getShape("SQUARE");
		sqshape.draw();

		Shape trshape = shapefactory.getShape("TRIANGLE");
		trshape.draw();

		Shape rctshape = shapefactory.getShape("RECTANGLE");
		rctshape.draw();

		Shape crcshape = shapefactory.getShape("CIRCLE");
		crcshape.draw();
	}

}
