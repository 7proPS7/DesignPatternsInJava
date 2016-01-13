package com.pablos.abstractfactorypattern;

public class AbstractFactoryPatternMain {

	public static void main(String[] args) {

		// SHAPE FACTORY
		AbstractFactory shapefactory = FactoryProducer.getFactory("SHAPE");

		Shape sqshape = shapefactory.getShape("SQUARE");
		sqshape.draw();

		Shape trshape = shapefactory.getShape("TRIANGLE");
		trshape.draw();

		Shape rctshape = shapefactory.getShape("RECTANGLE");
		rctshape.draw();

		Shape crcshape = shapefactory.getShape("CIRCLE");
		crcshape.draw();
		
		System.out.println();

		// COLOR FACTORY
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		Color rdcolor = colorFactory.getColor("RED");
		rdcolor.fill();

		Color grcolor = colorFactory.getColor("GREEN");
		grcolor.fill();

		Color blcolor = colorFactory.getColor("BLUE");
		blcolor.fill();

		Color orgcolor = colorFactory.getColor("ORANGE");
		orgcolor.fill();

	}

}
