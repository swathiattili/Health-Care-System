package com.training.cg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamDemo {
public static void main(String args[]) {
/*    List<String> strings = Arrays.asList("ram","","","Mohan","Suraj","Rani");
    Stream<String> stream = strings.stream();
    long counter = stream.filter(str->str.equals("")).count();
System.out.println("Total empty stringd are:"+counter);
}
}
 //intermediate operation equals ("")(filter,map)
//terminate operation -for each loop through ur stream,collect,count
// take a list of integers and filters out all the odd numbers*/


	/*List<Integer> num = Arrays.asList(5,6,7,8);
Stream<Integer> stream = num.stream();
Stream<Integer> stream1 = num.stream();
stream1.sorted().forEach(System.out::println);*/
	/*List<String> names=Arrays.asList("Ram","aSH");
	//List<Integer> num=Arrays.asList();
	Stream<String> stream1=names.stream();
	boolean va1=stream1.allMatch(s->s.startsWith("R"));
	System.out.println(va1);*/
	//Optional<String> newString = stream1.reduce ((a,b) ->a+","+b);

//Calcuate sum of all even numbers from a list using stream
	List<Integer>num =Arrays.asList(1,2,3,4,5);
Stream<Integer> stream1 = num.stream();
stream1.filter(i->i%2==0).reduce( (a,b)-> a+b ).ifPresent(System.out::println);
}
}
//