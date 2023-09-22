package com.sit.day.six.oop2.inheritance;
public class MultipleLanguage extends MultipleFrontEnd {
	String language = "Java";

	  // implement method of interface
	  public void connectServer() {
	    System.out.println(language + " can be used as backend language.");
	  }
 

public static void main(String[] args) {

  // create object of Language class
	  MultipleLanguage java = new MultipleLanguage();

  java.connectServer();
// call the inherited method of FrontEnd class
  java.responsive(java.language);
}
}
