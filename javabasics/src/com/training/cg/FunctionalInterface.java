package com.training.cg;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		System.out.println(b);
		Consumer<Double> c=(a)->
		{
			System.out.println(b/2);
		
		c.accept((double) b);
		};
		Predicate predicate=(value)->value!=null;
		Supplier<Integer> s= ()->
		System.out.println(s.get());
		((Consumer<Double>) s.accept((Integer)));
	}
//https://www.sanfoundry.com/java-questions-answers-freshers-experienced/
}//https://www.interviewbit.com/java-mcq/
