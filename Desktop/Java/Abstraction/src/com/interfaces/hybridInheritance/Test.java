package com.interfaces.hybridInheritance;

public class Test {

	public static void main(String[] args) {
		//hybris inheritance is a combo of multiple+interfac and class+single inheritance
		//here Vechile and Car is multilple interface and child is fuelcar so multiple inheritance
		//fuelcar and BmwCar are classes is single inheritance
		
		BmwCar bc = new BmwCar();
		bc.start();//from vechile inheritance
		bc.carName(); //from Car inheritance
		bc.price();//from FuelCar class

	}

}
