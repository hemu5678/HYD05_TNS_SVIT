package com.sit.day.six.oop2.inheritance;

public class MultiLevelProgram3 extends MultiLevelProgrammer2 {
	int getLineofCode() {
		return 20;
	}
	
	public static void main(String[] args) {
		MultiLevelProgram3 mp3 = new MultiLevelProgram3();
		System.out.println("I am "+mp3.getName()+" and I code in " + mp3.getCodinglanguage()+" . This Program has" + mp3.getLineofCode()+" lines");
	}
	

}
