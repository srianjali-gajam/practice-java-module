package com.interfacs.sim;

public class Uninor implements Sim {
	
	int a=90;

	@Override
	public int imeiNumb() {
		System.out.println("Coming from Uninor imei number ");
		return 139289874;
		
	}

	@Override
	public void adharNumb() {
		System.out.println("Coming from Uninor adhar");
		
	}

	@Override
	public int mobileNumb() {
		return 9898848;
	
		
	}

}
