package com.pablos.pattern.flyweight;

public class FlyWeightPatternMain {
	private static final String making[] = { "GOLD", "COPPER", "SILVER", "PLATINUM", "BRONZE" };

	public static void main(String[] args) {
		for (int i = 0; i < 30; ++i) {
			Coin coin = (Coin) ItemFactory.getCoin(getRandomColor());
			coin.setX(getRandomX());
			coin.setY(getRandomY());
			coin.setRadius(100);
			coin.show();
		}

	}

	private static String getRandomColor() {
		return making[(int) (Math.random() * making.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}

}
