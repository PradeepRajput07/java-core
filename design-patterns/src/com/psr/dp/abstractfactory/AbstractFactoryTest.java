package com.psr.dp.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {

		
		CarFactory hondaCarFactory = AbstractFactoryProducer.getCarFactory("honda");
		Car amaze = hondaCarFactory.createCar("amaze");
		amaze.drive();

		Car city = hondaCarFactory.createCar("city");
		city.drive();
		
		CarFactory hyundaiCarFactory = AbstractFactoryProducer.getCarFactory("hyundai");
		Car amaze2 = hyundaiCarFactory.createCar("i20");
		amaze2.drive();
	}

}
