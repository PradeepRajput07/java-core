package com.psr.dp.abstractfactory;

public class HondaCarFactory implements CarFactory {

	@Override
	public Car createCar(String carType) {
		
		if (carType == null) {
			return null;
		}

		if ("amaze".equalsIgnoreCase(carType)) {
			return new Amaze();
		} else if ("city".equalsIgnoreCase(carType)) {
			return new City();
		}
		
		return null;
	}
}
