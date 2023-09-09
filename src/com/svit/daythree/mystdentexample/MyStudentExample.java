package com.svit.daythree.mystdentexample;

	class Student{
	    int id;  // instance variables
	    String name; // instance variables
	}
	public class MyStudentExample {
	  public static void main(String[] args) {
	          Student object1 = new Student();
	object1.id = 1;
	        object1.name = "Srikanth";
	       Student obj2;
	   obj2 = new Student();
	        obj2.id = 2;
	        obj2.name = "Simple Snippets";
	        System.out.println(object1.id);
	        System.out.println(object1.name);
	        System.out.println(obj2.id);
	        System.out.println(obj2.name);     
	    } 
	}


