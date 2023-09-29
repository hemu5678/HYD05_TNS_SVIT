package com.svit.daynine.p1;

public class ClassA {
void display()
		{
		System.out.println("TNS Sessions");
		}


}
class B
{
public static  void main(String args[])
{
ClassA obj = new ClassA();
//trying to access private method of another class
 obj.display();
}
}
