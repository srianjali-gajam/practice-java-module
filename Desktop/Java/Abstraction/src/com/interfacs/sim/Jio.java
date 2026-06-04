package com.interfacs.sim;

public class Jio implements Sim{
	@Override
	public int imeiNumb() {
		System.out.println("Coming from jio imei number ");
		return 88878787;
		
	}

	@Override
	public void adharNumb() {
		System.out.println("Coming from jio adhar");
		
	}

	@Override
	public int mobileNumb() {
		System.out.println("Mobile number from jio");
		return 23234;
	
		
	}

}
