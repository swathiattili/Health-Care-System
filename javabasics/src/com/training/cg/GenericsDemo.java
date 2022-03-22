

package com.training.cg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GenericsDemo {
	public static void main (String args[])
	{
		List<Integer>list = new ArrayList<>();//generics is used for type safety for your
		list.add(2);
		
		Iterator<Integer>it = list.iterator();
		
		while(it.hasNext()) {
			int i=it.next();
			System.out.println(it.next());
		}		
		}

}
//ArrayList,LinkedList,Map
//Comparable and comparator
//Exception Handling ,Checked and Unchecked exceptions in java
//try catch and final block
//Generics
//Wrapper classes and autoboxing



