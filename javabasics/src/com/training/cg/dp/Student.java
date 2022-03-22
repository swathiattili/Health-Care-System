package com.training.cg.dp;

public class Student {

	String stdname;
	int stdage;
	String stdcollege;
	int stdgrade;
	
	boolean res=true;
	
	
 public Student(String stdname,int stdage,String stdcollege,int stdgrade)
 {
	 this.stdname=stdname;
	 this.stdage=stdage;
	 this.stdcollege=stdcollege;
	 this.stdgrade=stdgrade;
			 
	}
// public Student(String string, int stdname2, String stdcollege2, String string2) {
	// TODO Auto-generated constructor stub
	
public Student(String stdname2, int stdage2, String stdcollege2, String string) {
	// TODO Auto-generated constructor stub
}

//}
public boolean isEquals(Student std2)
 {
	 if (this.stdname == std2.stdname && this.stdage == std2.stdage && this.stdcollege == std2.stdcollege && this.stdgrade == std2.stdgrade)
		 res=true;
	 else
		 res=false;
	 
	 return res;
 }

	
	
}


