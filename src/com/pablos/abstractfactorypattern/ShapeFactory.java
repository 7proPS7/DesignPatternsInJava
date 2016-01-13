package com.pablos.abstractfactorypattern;

public class ShapeFactory extends AbstractFactory{

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		if (shapeType == null)
			return null;
		if (shapeType.equalsIgnoreCase("SQUARE"))
			return new Square();
		else if (shapeType.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if (shapeType.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		else if (shapeType.equalsIgnoreCase("TRIANGLE"))
			return new Triangle();
		//add other else if and add new class with type of shape shapeType.equalsIgnoreCase("...")

		return null;
	}

}
