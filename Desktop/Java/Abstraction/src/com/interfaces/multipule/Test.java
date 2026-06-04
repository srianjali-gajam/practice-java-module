package com.interfaces.multipule;

public class Test {

	public static void main(String[] args) {
		
		C c = new C();
		c.m1();
		
		
		//parent reference holding the child object
		//this is the better practise because we are restricting to parent rules only 
		//child has other methods also when two childs has same methods it will cause the errors
		A a = new C();
		System.out.println(a.a);

	}

}
