package com.training.cg;

public class StringDemo {
	
	public  static void main (String []args) {
/*String str1 = "example";
	String str2 = "exams";
	 System.out.println("Compare:"+str1.compareTo(str2));
	String str3 = new String("example");
	String str4 = new String("example");
	
	System.out.println(str3.equals(str4));//equals method compares the contents
    System.out.println(str3 == str2);
}
}           */
String str1 = "example";//String are immutable
String str2 = "exams";
StringBuilder sb=new StringBuilder("hi");//It is not synchronized
StringBuffer buffer =new StringBuffer("Welcome");//It is synchronized
buffer.append("Home");
System.out.println(buffer);
sb.append("Hello");
System.out.println(sb);
}
}
//substring,replace,indexOf,delete,charAt