package com.training.cg;

public class EmployeeTest {
	static {
		System.out.println("We are inside the static block..");
	}
	
   public static void main(String args[]) {
	   Employee emp1 = new Employee();//Constructor call
	   
	   emp1.setEmpId ("101_IN");
	   emp1.setEmpSalary(21000);
			   System.out.println(emp1.getEmpId());
			   System.out.println(emp1.getEmpSalary());
   }
   
}

// how to create java bean class?
//why attributes or variables should be declared as private?
//how to create an object of a class and access its data through the methods.
// constructor and default constructor
//use this method
//this method
//static members
// y main method is static

// class name should always b capitalized
// the variable name/method name should be
//