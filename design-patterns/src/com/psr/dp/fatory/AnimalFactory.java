package com.psr.dp.fatory;

public class AnimalFactory {

	public Animal createAnimal(String animalType) {

		if (animalType == null) {
			return null;
		}

		if ("horse".equalsIgnoreCase(animalType)) {
			return new Horse();
		} else if ("dog".equalsIgnoreCase(animalType)) {
			return new Dog();
		} else if ("deer".equalsIgnoreCase(animalType)) {
			return new Deer();
		}
		return null;
	}

}