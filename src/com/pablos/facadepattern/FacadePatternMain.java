package com.pablos.facadepattern;

public class FacadePatternMain {

	public static void main(String[] args) {
		ColorMaker colorMaker = new ColorMaker();
		
		colorMaker.fillRed();
		colorMaker.fillBlue();
		colorMaker.fillOrange();

	}

}
