package com.svit.daythree.myclass;

public class MyClass {
	int number;
    public MyClass() {
        System.out.println("Constructor Called");
        number=5;
    }
    public static void main(String[] args) {
        
        MyClass obj = new MyClass(); // Constructor Called
System.out.println("Number value is: "+obj.number);
    } 
}
//default constructor example
