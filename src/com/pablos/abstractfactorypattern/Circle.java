package com.pablos.abstractfactorypattern;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("circle inside Circle::draw()method");
	}

}
