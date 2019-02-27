package com.psr.dp.structural.adapter;

public class SamsungAdapter implements Chargeable {

	Charger samsungCharger;
	
	public void setSamsungCharger(Charger samsungCharger) {
		this.samsungCharger = samsungCharger;
	}
	
	@Override
	public void setMobileName(String mobileName) {
		//Keeping it empty intentionally !!
	}

	@Override
	public void charge() {
		System.out.println("-----------******************------------------");
		System.out.println("Using the class \'" + this.getClass().getSimpleName() + "\' now !!");
		samsungCharger.supplyCharge();
	}

}
