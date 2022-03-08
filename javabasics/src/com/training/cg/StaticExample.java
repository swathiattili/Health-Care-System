package com.training.cg;

public class StaticExample {
	
	StaticExample(){
		
	
       System.out.println("Inside Constructor");
	}
	
      static {
    	  System.out.println("Inside static block 1");
      }
      static void method1() {
    	  System.out.println("Inside method1");
      }
      static {
    	  System.out.println("Inside static block2");
      }
}
