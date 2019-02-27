package com.psr.dp.structural.adapter;

public class SamsungCharger implements Charger {

	String mobileName;
	
	@Override
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	@Override
	public void supplyCharge() {
		System.out.println(this.mobileName + " mobile is being charged ... !!!");
	}

}
