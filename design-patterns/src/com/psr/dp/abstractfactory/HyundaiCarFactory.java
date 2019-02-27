package com.psr.dp.abstractfactory;

public class HyundaiCarFactory implements CarFactory {

	@Override
	public Car createCar(String carType) {
		
		if (carType == null) {
			return null;
		}

		if ("i10".equalsIgnoreCase(carType)) {
			return new I10();
		} else if ("i20".equalsIgnoreCase(carType)) {
			return new I20();
		}
		
		return null;
	}

}