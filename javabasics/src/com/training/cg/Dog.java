package com.training.cg;

public class Dog extends Animal {
	String breed="lab";
	public String name;
	
	 public String getInfo(String string) {
	
		String str = breed+ "is a"+type+"who is"+age+"years old";
		return breed+"is a "+type+"who is"+age+"years old";

		//method overloading
		//public String getInfo(String name) {
			
			//return name+"Overloading demo";
		}
      // public int compareTo(Dog o) {
    	   //if(this.name.equals(o.name)) {
    		  // return this.name.compareTo(o.name);
    	  // }
    	   //return 1;
       }


