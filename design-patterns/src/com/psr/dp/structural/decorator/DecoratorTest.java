package com.psr.dp.structural.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Pizza panPizza = new PanPizza();
		
		panPizza = new Tomatoes(panPizza);
		//panPizza = new Onions(panPizza);
		panPizza = new Jalapenos(panPizza);
		
		System.out.println("You've ordered: Pan Pizza with " + panPizza.description());
		System.out.println("Your order total cost is - $" + panPizza.cost());
	}

	
}
