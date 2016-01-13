package com.pablos.abstractfactorypattern;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("square inside Square::draw()method");
	}

}
