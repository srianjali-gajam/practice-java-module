package com.interfaces.multipule;

public class C implements A , B{

	int a=50;
	@Override
	public void m1() {
		//Diamond problem :m1() is available in both A and B interfaces 
		//when child object is called it is coming from Child class only 
		//because the method is implemented in child class
		System.out.println("Coming from child class C only");
		
		
	}

}
