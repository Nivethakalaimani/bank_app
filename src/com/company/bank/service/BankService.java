package com.company.bank.service;
import com.company.bank.data.*;

public  class BankService implements Rbi{
	private double userAmount;
	String name;
	BankCharge charge=new BankCharge();
	UserData current=new UserData();
	public BankService()
	{
		
	}
	public BankService(UserData user) {
		current=user;
		//System.out.println(current);
		userAmount = user.getUserAmount();
		name=user.getUserName();
		
	}
	
    public void displayBalance() {
		System.out.println("Balance:"+userAmount);
	}
	
	 public void deposit(double amount) {
		userAmount += amount;
		userAmount -= userAmount * charge.depositAmount;
		current.setUserAmount(userAmount);
		displayBalance();
		Statements st=new Statements(name,"Deposit",userAmount);
	}
	
	 public void withdraw(double amount) {
		
			if (amount > userAmount || userAmount - amount < 300 ) {
				System.out.println("Invalid amount or insufficient balance");
			} else {
				userAmount -= amount;
				userAmount -= userAmount * charge.withdrawAmount;
				current.setUserAmount(userAmount);
				displayBalance();
				Statements state=new Statements(name,"WithDrawn",userAmount);
			}
		
	}
	 
	 
}
