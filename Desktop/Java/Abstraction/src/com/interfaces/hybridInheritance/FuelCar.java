package com.interfaces.hybridInheritance;

public class FuelCar implements Vechile,Car{

	@Override
	public void carName() {
        System.out.println("Car name");
		
	}

	@Override
	public void start() {
		System.out.println("Fuel car is started");
		
	}
	public void price() {
		System.out.println(3287824);
	}

}
