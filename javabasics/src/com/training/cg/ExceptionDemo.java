package com.training.cg;

public class ExceptionDemo {
public static void main(String args[])throws MyException
{
	int[] number = new int[4];
	
	for(int i=0;i<=number.length;i++) {
		//System.out.println("number[i]");
	}
	int age=5;
	String[] grades= {"A","B","C","D"};
	//Animal a1= new Animal();
	
		 //a1.getNumber(5);
		 if(age<18) {
			 throw new MyException("Not Eligible to vote");
		 }
	
	
		System.out.println("Exception occurred");
	
    //int a = 8/0;
 System.out.println("Display array values::End");

}
}