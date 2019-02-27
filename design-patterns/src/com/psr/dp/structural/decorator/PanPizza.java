package com.psr.dp.structural.decorator;

public class PanPizza implements Pizza {

	@Override
	public String description() {
		return "Pan Pizza with :";
	}

	@Override
	public Double cost() {
		return 10.0;
	}

}
