package com.company.bank.user;
import java.util.Scanner;

import com.company.bank.data.UserData;
import com.company.bank.service.BankService;
import com.company.bank.service.HelpandSupport;
import com.company.bank.service.Statements;
import com.company.bank.service.Transaction;

public class UserAccess extends UserValidation {
	
  int withdrawCount;
	boolean flag;
	double userAmount=0;
	UserData currentUser=new UserData();
	public UserAccess(UserData user) {
		currentUser=user;
		
		flag=true;
		showService();
	    
	}
	
	Scanner sc=new Scanner(System.in);
	
	 
	  void showService() {
      while(flag) {
  	    int num;
  	  BankService services=new BankService(currentUser);
  	  
        System.out.println("1.WithDraw");
        System.out.println("2.Deposit");
        System.out.println("3.CheckBalance");
        System.out.println("4.BankStatements");
        System.out.println("5.Help and Support");
        System.out.println("6.Online Transaction");
        System.out.println("Enter the number");
       
        num=sc.nextInt();
  	  flag=false;
  	
    switch(num)
    {
    case 1:
  	  int amt;
  	 if(withdrawCount<3) {
  	  System.out.println("Enter the amount:");
  	  amt=sc.nextInt();
  	  
  	  if(amt%100==0)
  	  {
  	  withdrawCount++;
  	  services.withdraw(amt);
  	  }
  	  else
  	  {
  		  System.out.println("Please enter valid amount");
  	  }
  	  }
  	else {
		System.out.println("You have already withdrawn 3 times in a day");
	 }
  	  break;
    case 2:
  	  int amtDeposit;
  	 
  	  System.out.println("Enter the amount:");
  	  amtDeposit=sc.nextInt();
  	  if(amtDeposit%100==0)
  	  services.deposit(amtDeposit);
  	  else
  		  System.out.println("Please deposit valid amount");
  	 
  	
  	  break;
    case 3:
  	  services.displayBalance();
  	  break;
    case 4:
    	Statements st=new Statements();
    	
    	st.printStatement();
    	break;
    case 5:
    	HelpandSupport help=new HelpandSupport();
    	help.getComplaint();
    	break;
    case 6:
    	Transaction transaction=new Transaction(currentUser);
    	transaction.getReceiverDetails();
    	break;
  	 
  default:System.out.println("Enter valid number");
    }
    System.out.println("Do you want to continue [y/n]:");
    char choice;
    choice=sc.next().charAt(0);
    if(choice=='y')
    {
  	  flag=true;
    }
    else
    {
  	  flag=false;
  	  System.out.println("Successfully Logged out");
    }
	}
      }
	  
}

