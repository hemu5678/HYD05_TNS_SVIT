package com.svit.daythree.myclass1;

public class MyClass1 {
	int number;
    public MyClass1(int x) {
        System.out.println("Parameterized Constructor Called");
        number=x;
    }
   
    public static void main(String[] args) {
        
        MyClass1 obj = new MyClass1(4); // Parameterized Constructor Called
        System.out.println("Number value is: "+obj.number);
    }  
}
//parameterized constructor example
