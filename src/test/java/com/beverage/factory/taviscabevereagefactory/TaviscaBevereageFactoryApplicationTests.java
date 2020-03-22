package com.beverage.factory.taviscabevereagefactory;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.beverage.factory.exception.InValidOrderException;
import com.beverage.factory.exception.NoMenuFoundException;
import com.beverage.factory.java.BeverageFactoryApplication;

import junit.framework.Assert;

@SpringBootTest
class TaviscaBevereageFactoryApplicationTests {

	@Test
	void positiveTestCase() {
		String order = "Chai, - sugar, -milk";// 4 -1 - 0.5=2.5
		String order2 = "Coffee, -milk";// 5-1=4
		List<String> orderItemList = new ArrayList<>();
		orderItemList.add(order);
		orderItemList.add(order2);
		// total order cost= 6.5= 4+2.5;
		Assert.assertEquals(6.5, BeverageFactoryApplication.takeCustomerOrder(orderItemList));
	}

	// - An order cannot have all the ingredients in exclusion for a menu item.
	@Test
	void inValidOrderExceptionTest() {
		String order = "- sugar, -milk";
		List<String> orderItemList = new ArrayList<>();
		orderItemList.add(order);
		Assertions.assertThrows(InValidOrderException.class, () -> {
			BeverageFactoryApplication.takeCustomerOrder(orderItemList);
		});
	}

	// Each order should have at least one menu item
	@Test
	void inValidMenuOrEmptyMenuExceptionTest() {
		// No order is there, empty order list...
		List<String> orderItemList = new ArrayList<>();
		Assertions.assertThrows(NoMenuFoundException.class, () -> {
			BeverageFactoryApplication.takeCustomerOrder(orderItemList);
		});
	}
	
	//- An order can exist without exclusion
	@Test
	void orderWithoutExclustion() {
		String order = "Chai";// 4
		String order2 = "Coffee";//5
		List<String> orderItemList = new ArrayList<>();
		orderItemList.add(order);
		orderItemList.add(order2);
		// total order cost= 4+5=9;
		Assert.assertEquals(9d, BeverageFactoryApplication.takeCustomerOrder(orderItemList));
	}
	
	//- An order with 5 menu items...
		@Test
		void orderWithMultipleMenuItems() {
			String order = "Chai, -sugar";// 3.5=4 - .5
			String order2 = "Chai";//4
			String order3 = "Coffee, -milk";//4 = 5 - 1
			String order4 = "Coffee";//5
			String order5 = "Strawberry Shake, - sugar";//6.5= 7 - c.5
			
			//sum= 23
			List<String> orderItemList = new ArrayList<>();
			orderItemList.add(order);
			orderItemList.add(order2);
			orderItemList.add(order3);
			orderItemList.add(order4);
			orderItemList.add(order5);
			
			// total order cost=23;
			Assert.assertEquals(23d, BeverageFactoryApplication.takeCustomerOrder(orderItemList));
		}
	
}
