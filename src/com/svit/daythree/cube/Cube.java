package com.svit.daythree.cube;

public class Cube {
	int side;
	static int objectCount=0;
	Cube()
	{
	objectCount++;
	}
	Cube(int x)
	{
	side=x;
	objectCount++;
	}
	public static void main(String[] args)
	{
	Cube c1=new Cube();
	Cube c2=new Cube(5);
	Cube c3=new Cube(8);
	Cube c4=new Cube(10);
	Cube c5=new Cube(11);
	System.out.println("Number of Cube Objects: "+objectCount);
	}
	}
//static variable example
