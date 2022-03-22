package com.training.cg.dp;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Employee {
 private String empSalary;
 private String empName;;
 private String empId;
  Employee(){
	  
  }
  
 Employee(Object obj){
	 if(obj instanceof LinkedHashMap) {
		Map<String,Object>myMap=(LinkedHashMap<String,Object>) obj; 
		this.empId =(String) myMap.get("empId");
		this.empSalary=(String) myMap.get("empSalary");
		this.empName=(String) myMap.get("empName");
	 }else {
		 System.out.println("Null values");
		 return;
			
	 }
 }

public String getEmpSalary() {
	return empSalary;
}

public void setEmpSalary(String empSalary) {
	this.empSalary = empSalary;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public String getEmpId() {
	return empId;
}

public void setEmpId(String empId) {
	this.empId = empId;
}

public Object calculate() {
	String pf =0.12+this.empSalary;
	String allowance = 0.15+this.empSalary;
	LinkedList myList = new LinkedList();
	myList.add(pf);
	myList.add(allowance);
	return myList;
}
public static void main(String args[]) {
	Map<String,Object> allValues = new LinkedHashMap<>();
	allValues.put("empName", "alex");
	allValues.put("empSalary","25000");
	allValues.put("empId", "AASDF");
	
	Employee myEmployee = new Employee(allValues);
	List<Double> resultList =(List<Double>)myEmployee.calculate();
	System.out.println("Id: "+myEmployee.getEmpId());
	System.out.println("Name: "+myEmployee.getEmpName());
	System.out.println("Salary:"+myEmployee.getEmpSalary());
}
}