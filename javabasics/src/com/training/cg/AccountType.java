package com.training.cg;

public class AccountType implements Account {
	
	double INITIALBALANCE = 1000;
	double totalBalance;
	final double RATEOFINTEREST=5;
	double checkBalance;
	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		totalBalance=totalBalance+amount;
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>totalBalance)
		{
			System.out.println("Insufficient Amount");
		}
		else
		{
			totalBalance=totalBalance-amount;
		}
	}
	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return totalBalance+RATEOFINTEREST;
	}
}
