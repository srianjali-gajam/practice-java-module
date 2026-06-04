package com.interfaces.troi;

public class Jio implements Troi{

	@Override
	public void calling() {
		System.out.println("Jio calling service enabled");
		
	}

	@Override
	public void data() {
		System.out.println("Jio data Package is increased");
		
	}

	@Override
	public void sms() {
		System.out.println("Jio sms Package is increased by 2pice for 1sec ");
		
	}

	@Override
	public void roaming() {
		System.out.println("Jio international roaming  Package is increased");
		
	}

}
