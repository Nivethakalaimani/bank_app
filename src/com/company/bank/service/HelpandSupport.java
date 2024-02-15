package com.company.bank.service;
import java.time.LocalDate;

import java.util.*;
public class HelpandSupport extends BankService implements Rbi{
	String complaint;
	String userName;
	String status;
    LocalDate date;
    ArrayList<String> complaints=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public HelpandSupport() {
    	date=LocalDate.now();
    	
    	
    }
    
    public void getComplaint() {
    	 complaint=sc.next();
    	 String state=userName+" complaint:"+complaint+"  Status:"+status+" Date:"+date;
    	 complaints.add(state);
    	 sc.close();
    }
   
}
