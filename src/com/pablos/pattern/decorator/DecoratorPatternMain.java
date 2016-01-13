package com.pablos.pattern.decorator;

public class DecoratorPatternMain {

	public static void main(String[] args) {
		Car body = new Body();
		Car tire = new Tire();
		Car glass = new Glass();
		
		Car darkRedBody = new DarkRedCarDecorator(new Body());
		Car blackTire = new BlackCarDecorator(new Tire() );
		Car tinedGlass = new TintedCarDecorator(new Glass());
		
		System.out.println("Car with normal border");
		body.show();
		tire.show();
		glass.show();
		
		System.out.println("\nBody of dark red color");
		darkRedBody.show();
		
		System.out.println("\nTire of black color ");
		blackTire.show();
		
		System.out.println("\nGlass of tined color");
		tinedGlass.show();
		
	}

}
