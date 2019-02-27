package com.psr.dp.structural.decorator;

public class Onions extends PizzaToppings {

	public Onions(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return this.pizza.description() + " Onions";
	}

	@Override
	public Double cost() {
		return pizza.cost() + 2;
	}

}
