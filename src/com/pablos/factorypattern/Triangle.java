package com.pablos.factorypattern;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("triangle inside Triangle::draw()method\n");
	}

}
