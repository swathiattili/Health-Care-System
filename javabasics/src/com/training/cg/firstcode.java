package com.training.cg;
import java.util.*;  
public class firstcode
{  
public static void main (String args[]) {
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number: ");    
int num=sc.nextInt();  
for(int n=1;n<=10;n++)
if(num==10)  
System.out.println(num+" Congrats!! you guessed it right in 4 attempts" );  
else  
System.out.println(num+" Not really!!try again.");  
}  
}  