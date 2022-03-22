//Java 8 Changes
//1.Lamda Expression
//Functional interface
package com.training.cg;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class LamdaDemo {

private static String avg;
private static double[] a;

public static void main (String args[]) {
	 //Addition add=new Addition();
	 DemoInterface d=(a) -> {
		 double sum=0;
	 for(int i=0;i<a.length;i++) {
		sum=sum+a[i]; 
		 //auto print_array=[](int &array,int i)}->int{
// return type of a lamda expression

	//System.out.println("average is:"+(a+b+c)/3);
	 }
	System.out.println("sum "+sum);
	
	System.out.println("Average is:"+(sum/Array.getLength(a)));	 
	 };
	int[] nums= {2,5,4,7};
	d.show(nums);
	//d.show(avg);
    //d.show(30,80);//average ki
 

	
	 };
	 
}



	
	//public void show() {
	//	System.out.println("Dummy");
	
	
//write a lamda expression to calculate average of 3 numbers
//pass an array of int and calculate the average value of all the elements
//function interface is the one which has maximum one abstract method

/*Predicate<Integer>p=(b)->{
	if(b>5) {
	return true;
	}
	else {
		return false;
	}
};
   boolean pass = p.test(4);
 System.out.println(pass);
	}
}
}*/
