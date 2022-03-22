package com.training.cg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
	public static void main(String args[]) throws IOException {
		char[]arr = new char[100];
		File file=new File("C:\\Users\\SWATHI\\eclipse-workspace\\javabasics\\test.txt");
		//FileReader input=null;
		BufferedWriter output = null;
		BufferedReader br = null;
	/*	try {
		//File file = new File("test.txt");
	input=new FileReader("C:\\Users\\SWATHI\\eclipse-workspace\\javabasics\\test.txt");
	ufferedReader br = new BufferedReader(new FileReader(file));
		br.lines().forEach(System.out::println);*/
		//input.read(arr);
		try {
			FileWriter fw = new FileWriter(file);
			output = new BufferedWriter(fw);
			output.write("hi.........this is from the java code..");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		output.close();
		//finally {
			//file.close();
		//}
		//System.out.println("Reading the file:::");
		//System.out.println("arr");
	

	/*	boolean val= false;
		try {
			val=file.createNewFile()
;
			}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		if(val) {
			System.out.println("File created succesful..");
		}
		else {
			System.out.println("File created unsuccessfull..");
		}
	}
}   */
/*if(file.delete()) {
	System.out.println("File is delete");}
	else
		System.out.println("unable is delete");*/
}
		
}