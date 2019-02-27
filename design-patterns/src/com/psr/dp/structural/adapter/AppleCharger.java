package com.psr.dp.structural.adapter;

public class AppleCharger implements Chargeable {

	private String mobileName;
	
	@Override
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	@Override
	public void charge() {
		System.out.println(this.mobileName + " is being charged !!");
	}

}
