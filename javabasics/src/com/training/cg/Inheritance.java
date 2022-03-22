package com.training.cg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Inheritance   {
	public static void main(String args[]) {
	//Cat cat1= new Cat();
	//cat1.name="doll";
	//cat1.name="mammal";
	//cat1.age=2;
	//cat1.haircolor="brown";
	//System.out.println("dog is a mammal who is 2 years old");
     //Animal d1= new Dog();
	 Dog d1 = new Dog();
	 d1.name = "tommy";
	 d1.type = "Mammal";
	 d1.breed="lab";
	 d1.age = 3;
	// System.out.println(d1.getInfo());//Dynamic polymorphism
	 Dog d2 = new Dog();
	 d2.name = "snoopy";
	 d2.type = "Mammal";
	 d2.breed="lab";
	 d2.age = 2;
	 
	 Dog d3 = new Dog();
	 d3.name = "milky";
	 d3.type = "Mammal";
	 d3.breed="lab";
	 d3.age = 1;
	 
	 Dog d4 = new Dog();
	 d4.name = "milky";
	 d4.type = "Mammal";
	 d4.breed="lab";
	 d4.age = 1;
	 
	// Set<Dog> allDogs = new TreeSet<Dog>();
	 
	 Set<Dog> allDogs = new HashSet<Dog>();
	 
	 List<String> string = new LinkedList<String>();//linked list
	 Set<Integer> values = new HashSet<Integer>();//Wrapper classes;
	 Map<String,Dog> myMap = new HashMap<String,Dog>();
	 myMap.put(d1.name,d1);
	 myMap.put(d2.name,d2);
	 myMap.put(d3.name,d3);
	 
	 string.add("zebra");
	 string.add("Dog");
	 string.add("cat");
	 string.add("zebra");
	 		 
	 
	  Set <String> strings = new TreeSet<String>();
      allDogs.add(d1); 	
	 allDogs.add(d2);
	 allDogs.add(d3);
	 allDogs.add(d4);
	 
	 for(Entry<String, Dog> entry:myMap.entrySet()) {
		 System.out.println("Key:"+entry.getKey()+"Value:"+entry.getValue().age);
		 entry.getValue();
	 }
	 //Iterator<Dog> it = allDogs.iterator();
for(Dog d:allDogs) {
	System.out.println(d.name+"Age:"+d.age); //or (d.name);for three dogs name
	}
	}
}

//how to stop set to add duplicate objects?

//Inhertiance
//method overridding
//parent class reference can point to a child class object//method overridding is an example dynamic polymorphism