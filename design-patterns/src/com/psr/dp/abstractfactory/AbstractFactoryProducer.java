package com.psr.dp.abstractfactory;

public class AbstractFactoryProducer {
	
	public static CarFactory getCarFactory(String factoryType) {
		
		if (factoryType == null) {
			return null;
		}

		if ("honda".equalsIgnoreCase(factoryType)) {
			return new HondaCarFactory();
		} else if ("hyundai".equalsIgnoreCase(factoryType)) {
			return new HyundaiCarFactory();
		}
		
		return null;
		
	}

}
