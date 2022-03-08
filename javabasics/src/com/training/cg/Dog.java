package com.training.cg;

public class Dog extends Animal {
	String breed="lab";
	
	 public String getInfo() {
		
		return breed+"is a "+type+"who is"+age+"years old";

		//method overloading
		//public String getInfo(String name) {
			
			//return name+"Overloading demo";
		}
}
