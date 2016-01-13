package com.pablos.abstractfactorypattern;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String colorType) {
		if (colorType == null)
			return null;
		if (colorType.equalsIgnoreCase("RED"))
			return new Red();
		else if (colorType.equalsIgnoreCase("GREEN"))
			return new Green();
		else if (colorType.equalsIgnoreCase("BLUE"))
			return new Blue();
		else if (colorType.equalsIgnoreCase("ORANGE"))
			return new Orange();
		// add other else if and add new class with type of shape
		// shapeType.equalsIgnoreCase("...")

		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
