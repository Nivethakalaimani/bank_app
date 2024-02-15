package com.company.bank.service;
import java.time.LocalDate;
import java.util.*;
import com.company.bank.user.*;
import com.company.bank.data.*;
public class Transaction extends BankService implements Rbi {
    String senderName;
    String senderPassword;
    String receiverName;
    double depositAmount;
    double senderAmount;
    double receiverAmount;
    LocalDate date;
    Scanner sc=new Scanner(System.in);
    UserData sender=new UserData();
    UserData receiver=new UserData();
    public Transaction(UserData user) {
    	sender=user;
    }
   
   public void getReceiverDetails()
    {
    	
    	
    	if(sender!=null)
    	{
    		System.out.println("Enter the receiver name:");
    		receiverName=sc.next();    
    	   UserService receive=new UserService();
    	   receiver=receive.checkIfUserExists(receiverName);
    	   if(receiver!=null)
    		   amountTransaction();
    	}
    	
    }
    public void amountTransaction()
    
    {
    	
    	System.out.println("Enter the amount:");
    	depositAmount=sc.nextDouble();
    	sender.setUserAmount(sender.getUserAmount()-depositAmount);
    	receiver.setUserAmount(receiver.getUserAmount()+depositAmount);
    	Statements statement=new Statements(sender.getUserName(),"Online Transaction",sender.getUserAmount());
    	
    	
    }
    
}
