package com.beverage.factory.java;

import java.util.ArrayList;
import java.util.List;

import com.beverage.factory.exception.InValidOrderException;
import com.beverage.factory.exception.NoMenuFoundException;
import com.beverage.factory.util.IngredientsPrices;
import com.beverage.factory.util.MenuItems;

public class BeverageFactoryApplication {

	// i am supposing order is coming in VALID String format

	// for Junits please refer..TaviscaBevereageFactoryApplicationTests class

	public static double takeCustomerOrder(List<String> orderItemList)
			throws InValidOrderException, NoMenuFoundException {
		double finalBillPrice = 0;

		if (orderItemList.size() < 1) {

			throw new NoMenuFoundException(" Order Menu is empty, please add some menu items...");
		}

		else {

			for (String orderItem : orderItemList) {

				List<String> exclusionList = new ArrayList<>();
				List<String> IncludeList = new ArrayList<>();

				String[] item = orderItem.split(",");

				for (String itemPart : item) {

					itemPart = itemPart.trim();

					if (itemPart.startsWith("-")) {

						exclusionList.add(itemPart.substring(1).trim());
					} else {
						IncludeList.add(itemPart);
					}

				}

				if (IncludeList.size() < 1) {

					throw new InValidOrderException(
							"An order cannot have all the ingredients in exclusion for a menu item");

				}

				else if (IncludeList.size() >= 1) {

					finalBillPrice = finalBillPrice + processOrderForBilling(IncludeList, exclusionList);

				}

			}
			System.out.println("finalBillToPay==" + finalBillPrice);

		}
		return finalBillPrice;

	}

	private static double processOrderForBilling(List<String> inclusionList, List<String> exclusionList) {

		MenuItems[] menuitems = MenuItems.values();
		IngredientsPrices[] ingredientsPrices = IngredientsPrices.values();
		String keyItem = inclusionList.get(0);
		double Itemprice = 0;
		double exclusionPrice = 0;
		double finalBillToPay = 0;
		for (MenuItems menuItems2 : menuitems) {

			if (keyItem.equalsIgnoreCase(menuItems2.getItem())) {

				Itemprice = menuItems2.getPrice();

			}

		}

		for (String exItem : exclusionList) {

			for (IngredientsPrices ingredientsPrice : ingredientsPrices) {

				if (exItem.trim().equalsIgnoreCase(ingredientsPrice.getIngredient().trim())) {

					exclusionPrice = exclusionPrice + ingredientsPrice.getPrice();

				}

			}

		}
		finalBillToPay = finalBillToPay + (Itemprice - exclusionPrice);
		return finalBillToPay;

	}

}
