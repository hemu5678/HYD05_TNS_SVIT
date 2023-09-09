package com.svit.daythree.cube1;

public class Cube1 {
	static
	{
	System.out.println("static block is invoked");
	}
	static int calculateCube(int side)
	{
	return (side*side*side);
	}
	public static void main(String[] args) {
	//System.out.println("Cube value of 5 is: "+calculateCube1(5));
	System.out.println("Cube value of 5 is: "+Cube1.calculateCube(5));
	}
	}
//static blocks in java example

