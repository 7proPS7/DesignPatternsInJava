package com.pablos.pattern.flyweight;

public class Coin implements Item {
	private String making;
	private int x;
	private int y;
	private int radius;

	public Coin(String making) {
		this.making = making;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void setRadius(int radius){
		this.radius=radius;
	}
	@Override
	public void show() {
		System.out.println("Coin show() [Making: "+making+", x: "+x+", y: "+y+", radius: "+radius+" ]");
	}

}
