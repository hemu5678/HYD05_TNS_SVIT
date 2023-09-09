package com.svit.daytwo.ternarydemo;

public class TernaryDemo{
	public static void main(String[] args) {
		int age = 12;
		String a = "Allowed to vote";
		String b = "Not allowed to vote";
		String accessallowed = (age > 18) ? a : b;
		System.out.println(accessallowed);
	}
	
}


