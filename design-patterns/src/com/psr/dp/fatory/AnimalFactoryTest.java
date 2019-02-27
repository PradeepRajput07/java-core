package com.psr.dp.fatory;

public class AnimalFactoryTest {

	public static void main(String[] args) {
		
		String animalType = args[0];
		AnimalFactory animalFactory = new AnimalFactory();
		Animal animal = animalFactory.createAnimal(animalType);
		animal.eat();
	}
}