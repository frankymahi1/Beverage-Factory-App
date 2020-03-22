package com.beverage.factory.util;

public enum IngredientsPrices {
	
	SODA("soda",0.5),
	SUGER("sugar",0.5),
	MINT("mint",0.5),
	WATER("water",0.5),
	MILK("milk",1);
	
	private String ingredient;
	private double price;
	
	private IngredientsPrices(String ingredient, double price) {
		this.ingredient = ingredient;
		this.price = price;
	}
	public String getIngredient() {
		return ingredient;
	}
	public double getPrice() {
		return price;
	}
	
}
