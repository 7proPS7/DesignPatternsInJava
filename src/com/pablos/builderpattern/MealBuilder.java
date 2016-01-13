package com.pablos.builderpattern;

public class MealBuilder {
	public Meal prepareVegMeal(){
		Meal meal =  new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Mirinda());
		return meal;
	}
	public Meal prepareMeal(){
		Meal meal =  new Meal();
		meal.addItem(new PaniniWithChicken());
		meal.addItem(new Coffee());
		return meal;
	}
	

}
