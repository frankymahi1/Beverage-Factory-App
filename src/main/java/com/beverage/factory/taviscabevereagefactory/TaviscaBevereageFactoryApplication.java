package com.beverage.factory.taviscabevereagefactory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.beverage.factory.java.BeverageFactoryApplication;;

@SpringBootApplication
public class TaviscaBevereageFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaviscaBevereageFactoryApplication.class, args);

		// below section is just for one happy scenraio....
		// for full test cases execution please go to the test folder ...
		// please refer  TaviscaBevereageFactoryApplicationTests 
		// please run: mvn clean install < command....
		
		String order = "Chai, - sugar, -milk";// 4 -1 - 0.5=2.5
		String order2 = "Coffee, -milk";// 5-1=4
		List<String> orderItemList = new ArrayList<>();
		orderItemList.add(order);
		orderItemList.add(order2);
		// total order cost= 6.5= 4+2.5;
		BeverageFactoryApplication.takeCustomerOrder(orderItemList);

	}

}
