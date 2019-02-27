package com.psr.dp.structural.decorator;

public class Jalapenos extends PizzaToppings {

	public Jalapenos(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return this.pizza.description() + " Jalapenos";
	}

	@Override
	public Double cost() {
		return this.pizza.cost() + 5;
	}

}
