package com.interfacs.sim;

public class SimTest {

	public static void main(String[] args) {
		
		Uninor un = new Uninor();
		System.out.println(un.a);//cmnf from child class
		
		//parent interace ref holding the child obj
		//here access restricted to parent interface so only parent class defined methods are accessed.
		//the access are restricted parent only when you want to access child variable create an obj for child
		Sim sim = new Uninor();
		sim.imeiNumb();
		sim.adharNumb();
		sim.mobileNumb();
		System.out.println(sim.a);//cmng from parents

	}

}
