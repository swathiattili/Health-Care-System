package com.training.cg;

public class BankingDemo {
  public static void main(String args[]) {
	  SavingAccount sav1=new SavingAccount(5000);
	  sav1.deposite(4500);
	  System.out.println(sav1.checkBalance());
	  sav1.withdraw(1000);
	  System.out.println(sav1.checkBalance());
  }
 
}
