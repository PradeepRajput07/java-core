package com.psr.dp.structural.decorator;

public class Tomatoes extends PizzaToppings {
	
	public Tomatoes(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return this.pizza.description() + " Tomatoes";
	}

	//Decorates the pizza with tomatoes and returns the same pizza with the cost of tomatoes included
	@Override
	public Double cost() {
		return pizza.cost() + 1.0;
	}

}
