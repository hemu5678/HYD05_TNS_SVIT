package com.svit.dayfour.staticdemo;

public class StaticDemo {
	public static int a = 13; //static variable 
	 public static int b = 1199; // static variable
	 int c=10; // instance variable
	 public static void callme() 
	{
	System.out.println("The value of a = " + a);// static method can access static variable
	//System.out.println("The value of c = " + c);// static method can not access instance variable
	}

}
