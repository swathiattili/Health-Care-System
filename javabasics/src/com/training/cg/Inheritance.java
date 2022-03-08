package com.training.cg;

public class Inheritance {
	public static void main(String args[]) {
	//Cat cat1= new Cat();
	//cat1.name="doll";
	//cat1.name="mammal";
	//cat1.age=2;
	//cat1.haircolor="brown";
	//System.out.println("dog is a mammal who is 2 years old");
     Animal d1= new Dog();
	 //Dog d1 = new Dog();
	 d1.name = "tommy";
	 d1.type = "Mammal";
	 //d1.breed="lab";
	 d1.age = 3;
	 System.out.println(d1.getInfo());//Dynamic polymorphism
	 
	 //d1.getInfo("pug");//static polymorphism
}
}
//Inhertiance
//method overridding
//parent class reference can point to a child class object//method overridding is an example dynamic polymorphism