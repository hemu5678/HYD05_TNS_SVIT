package com.svit.daytwo.appdemo;

public class AppDemo {
	public class App {
		 
		   public static void main(String[] args) {
				String x = "Study";
				String y = "easy";
				String z = x.concat(y);
				
				z = z.replace("easy", "hard");
				
				System.out.println(z);
				
				if(z.equals("Studyeasy")){
					System.out.println("Text is Studyeasy");
				}else{
					System.out.println("Text is not Studyeasy");
				}
			}
		}

}
