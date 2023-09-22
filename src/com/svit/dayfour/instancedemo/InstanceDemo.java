package com.svit.dayfour.instancedemo;

public class InstanceDemo {
	public static int a = 13; //static variable
	 int b = 1199; //instance variable
	 public void callme() //instance method
	{
	System.out.println("The value of b = " + a); //instance method can access static variable
	System.out.println("The value of k = "+ b); // instance method can access instance variable 
	}

}
