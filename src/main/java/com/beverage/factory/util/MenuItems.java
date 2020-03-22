package com.beverage.factory.util;

public enum MenuItems {

	COFFEE("Coffee", "Coffee", "Milk", "Sugar", "Water", 5),

	CHAI("Chai", "Tea", "Milk", "Sugar", "Water", 4),

	BANANA_SMOOTHIE("Banana Smoothie", "Banana", "Milk", "Sugar", "Water", 6),

	STRAWBERRY_SHAKE("Strawberry Shake", "Strawberries", "Milk", "Sugar", "Water", 7),

	MOJITO("Mojito", "Lemon", "Sugar", "Water", "Soda", "Mint", 7.5);

	private String item;
	private String ingredient1;
	private String ingredient2;
	private String ingredient3;
	private String ingredient4;
	private String ingredient5;
	private double price;

	private MenuItems(String item, String ingredient1, String ingredient2, String ingredient3, String ingredient4,
			double price) {
		this.item = item;
		this.ingredient1 = ingredient1;
		this.ingredient2 = ingredient2;
		this.ingredient3 = ingredient3;
		this.ingredient4 = ingredient4;
		this.price = price;
	}

	private MenuItems(String item, String ingredient1, String ingredient2, String ingredient3, String ingredient4,
			String ingredient5, double price) {
		this.item = item;
		this.ingredient1 = ingredient1;
		this.ingredient2 = ingredient2;
		this.ingredient3 = ingredient3;
		this.ingredient4 = ingredient4;
		this.ingredient5 = ingredient5;
		this.price = price;
	}

	private MenuItems(double price) {
		this.price = price;
	}

	public String getIngredient1() {
		return ingredient1;
	}

	public String getIngredient2() {
		return ingredient2;
	}

	public String getIngredient3() {
		return ingredient3;
	}

	public String getIngredient4() {
		return ingredient4;
	}

	public String getIngredient5() {
		return ingredient5;
	}

	public double getPrice() {
		return price;
	}

	public String getItem() {
		return item;
	}

}
