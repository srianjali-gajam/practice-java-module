package com.interfaces;

public class Car implements Vechile{
      
	public Car() {	
	}

	@Override
	public void start() {
		System.out.println("The car is started");
		
	}
	
	public void speed() {
		System.out.println("Speed limit is 60 kmph");
	}
	

}
