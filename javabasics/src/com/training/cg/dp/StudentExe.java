package com.training.cg.dp;



public class StudentExe {
 public static void main(String args[])
 {
	Student std1=new Student("akshya",19,"FKS","A");
	 Student std2=new Student("aswin",20,"PEC","B");
	
	


	
	 System.out.println("Student 1: Student name:"+std1.stdname+"Student age:"+std1.stdage +"Student grade"+std1.stdgrade+"Student college"+std1.stdcollege);
	 System.out.println("Student 2: Student name:" +std2.stdname+"Student age:"+std2.stdage +"Student grade"+std2.stdgrade+"Student college"+std2.stdcollege);
	 
	 System.out.println(std1.equals(std2));
	 

 }
}
