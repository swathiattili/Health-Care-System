package com.training.cg;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ListOddnumbers {
	public static void main(String args[]) {
		//Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		//System.out.println("enter the numbers");
		List<Integer> num = Arrays.asList(101,200,300,400,500);
		//Collection<String> integers;
		Stream<Integer> stream = num.stream();
		Stream<Integer> stream1 = num.stream();
		stream.filter(i-> i%2!=0)
		//.forEach(i->System.out.println(i));
		.forEach(System.out::println);	//method reference
		
		stream1.map(i-> i+i).forEach(data->System.out.println(data));
				System.out.println("--------");
				for(int a:num) {
					System.out.println(a);
	
				}
		
	}

}
//take a list of integers andfilter out all the odd numbers