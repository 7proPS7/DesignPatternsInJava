package com.pablos.pattern.flyweight;

import java.util.HashMap;

public class ItemFactory {
	private static final HashMap<String, Item> coinMap = new HashMap<>();

	public static Item getCoin(String making) {
		Coin coin = (Coin) coinMap.get(making);

		if (coin == null) {
			coin = new Coin(making);
			coinMap.put(making, coin);
			System.out.println("Creating coin of making : " + making);
		}
		return coin;
	}

}
