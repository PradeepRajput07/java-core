package com.psr.dp.structural.adapter;

public class AdapterPatternTest {

	public static void main(String[] args) {
		
		Chargeable ch = new AppleCharger();
		ch.setMobileName("iPhoneX..");
		
		//**Using Apple Charger**//
		ChargeUtils.doCharge(ch);

		Charger samsungCharger = new SamsungCharger();
		samsungCharger.setMobileName("Galaxy Note 4");
		
		//** Using apple for charging samsung phone**//
		SamsungAdapter samsungAdapter = new SamsungAdapter();
		samsungAdapter.setSamsungCharger(samsungCharger);
		
		ChargeUtils.doCharge(samsungAdapter);
	}
}
