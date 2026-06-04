package com.interfaces.troi;

public class Airtel implements Troi  {

	@Override
	public void calling() {
		System.out.println("Airtel calling service enabled");
		
	}

	@Override
	public void data() {
		
		System.out.println("Airtel calling data service enabled");
		
	}

	@Override
	public void sms() {
		System.out.println("Airtel sms service enabled");
		
	}

	@Override
	public void roaming() {
		System.out.println("Airtel roaming service enabled");
		
	}

}
