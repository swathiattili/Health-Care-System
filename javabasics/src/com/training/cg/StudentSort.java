package com.training.cg;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StudentSort {
	public static void main(String args[]) {
		Student stud1=new Student();
		Student stud2=new Student();
		Student stud3= new Student();
		Student stud4=new Student();
		Student stud5=new Student();
		
		stud1.setStudName("swetha");
		stud2.setStudName("jyothi");
		stud3.setStudName("swathi");
		stud4.setStudName("sushmi");
		stud5.setStudName("yash");
		
		stud1.setStudGrade("A");
		stud2.setStudGrade("B");
		stud3.setStudGrade("C");
		stud4.setStudGrade("D");
		stud5.setStudGrade("E");
		 Map<String,Student> myMap =new HashMap<String,Student>();
		 
		myMap.put(stud1.getStudName(),stud1);
		 myMap.put(stud2.getStudName(),stud2);
		 myMap.put(stud3.getStudName(),stud3);
		 myMap.put(stud4.getStudName(),stud4);
		 myMap.put(stud5.getStudName(),stud5);
		
		 for(Map.Entry<String,Student>entry:myMap.entrySet()){
			System.out.println("Student Name:"+entry.getKey()+"Grade:"+entry.getValue().getStudGrade()); 
		 //}
		//List<Student> allStudents = new LinkedList<Student>();
		//allStudents.add(stud1);
		//allStudents.add(stud2);
		//allStudents.add(stud3);
		//allStudents.add(stud4);
		//allStudents.add(stud5);
		//Collections.sort(allStudents,new Student());
		
		 //for(Student s:allStudents) {
			 //System.out.println("Student Name:" +s.getStudGrade());
			 
		 }
	}
}




