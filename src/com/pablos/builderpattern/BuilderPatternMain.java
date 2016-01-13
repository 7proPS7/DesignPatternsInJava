package com.pablos.builderpattern;

public class BuilderPatternMain {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vmeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vmeal.showItems();
		System.out.println("Total cost: "+vmeal.getCost());
		
		Meal nonvmeal = mealBuilder.prepareMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonvmeal.showItems();
		System.out.println("Total cost: "+nonvmeal.getCost());
		

	}

}
