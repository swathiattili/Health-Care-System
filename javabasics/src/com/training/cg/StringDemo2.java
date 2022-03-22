package com.training.cg;

public class StringDemo2 {
	public static void main(String args[]) {
		StringBuffer buffer =new StringBuffer("Good morning");
		buffer.append("Everyone");
		System.out.println(buffer);
		buffer.delete(2, 8);
		System.out.println("After deletion: "+buffer);
		buffer.replace(2, 8, "swathi");
		System.out.println("After replacing: "+buffer);
		buffer.substring(9,11);
		System.out.println("After substring: "+buffer);
		buffer.indexOf("hello");
		System.out.println("After indexOf: "+buffer);
		int a= buffer.charAt(5);
		System.out.println("After charAt: "+a);
		buffer.substring(1,5);
		System.out.println("Ater substring: "+buffer);
		
		StringBuilder builder =new StringBuilder("Good morning");
		builder.append("Everyone");
		System.out.println(builder);
		builder.delete(2, 8);
		System.out.println("After deletion: "+builder);
		builder.replace(2, 8, "swathi");
		System.out.println("After replacing: "+builder);
		builder.substring(8);
		System.out.println("After substring: "+builder);
		builder.indexOf("morning");
		System.out.println("After indexOf: "+builder);
		builder.charAt(5);
		System.out.println("After charAt: "+builder);
		builder.substring(1,5);
		System.out.println("Ater substring: "+builder);
	}

}
