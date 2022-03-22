package com.training.cg;

public class  Animal {
String name;
String type;
int age;

public String getInfo() {
	return name+"is a "+type+"who is"+age+"years old";
}
public  int getNumber(int a1) {
	try{
		return a1/0;
	}
	catch(Exception e) {
		System.out.println("throws exception");
		return -1;
}

	
}

	
}
