package com.interfaces.troi;

public class TroiTest {

	public static void main(String[] args) {

     Airtel al = new Airtel();
     al.calling();
     al.data();
     al.sms();
     al.roaming();
     
     System.out.println("JIO SERVICE");
     Jio jo = new Jio();
     jo.calling();
     jo.data();
     jo.sms();
     jo.roaming();

	}

}
