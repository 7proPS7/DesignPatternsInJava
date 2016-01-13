package com.pablos.abstractfactorypattern;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("rectangle inside Rectangle::draw()method");
	}

}
