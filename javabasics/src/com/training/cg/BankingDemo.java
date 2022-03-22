package com.training.cg;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BankingDemo {
  public static void main(String args[]) {
	 /* SavingAccount sav1=new SavingAccount(5000);
	  sav1.deposite(4500);
	  System.out.println(sav1.checkBalance());
	  sav1.withdraw(1000);
	  System.out.println(sav1.checkBalance());
     */
	  SavingAccount sa1= new SavingAccount(5000);
	  SavingAccount sa2= new SavingAccount(5000);
	  SavingAccount sa3= new SavingAccount(5000);
	  SavingAccount sa4= new SavingAccount(5000);
  
	  sa1.deposite(2000);
	  sa1.withdraw(1000);
	  
	  sa2.deposite(1000);
	  sa2.withdraw(2000);
	  
	  sa3.deposite(3000);
	  sa3.withdraw(1500);
	  
	  sa4.deposite(3500);
	  sa4.withdraw(1700);
	  
	  Set<SavingAccount> allsav = new HashSet<SavingAccount>();
	 
	  allsav.add(sa1);
	  allsav.add(sa2);
	  allsav.add(sa3);
	  allsav.add(sa4);
	  
	  for(SavingAccount sa:allsav)
	  {
		 System.out.println( sa.checkBalance());
	      
	  }
  }
  
 
}
