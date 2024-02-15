package com.company.bank.service;

import java.time.LocalDate;
import java.util.*;
public class Statements extends BankService implements Rbi{
	String userName=null;
	String type=null;
	double userBalance;
	LocalDate date;
	public static ArrayList<ArrayList<String>> listofStatement=new ArrayList<>();
	public Statements()
	{
		
	}
	public Statements(String userName,String type,double userBalance) {
		super();
		this.userName=userName;
		this.type=type;
		this.userBalance=userBalance;
		date=LocalDate.now();
		addStatement();
	}
	void addStatement() {
	
		ArrayList<String> arrayList=new ArrayList<>();
		String statement="UserName:"+userName+"  Type:"+type+" UserBalance"+userBalance+"  Date:"+date;
        arrayList.add(statement);
		listofStatement.add(arrayList);
   // System.out.println(listofStatement);
	}
	public void printStatement()
	{
		for(ArrayList<String> st:listofStatement)
		{
			for(String userStatements:st)
			{
				if(userStatements.contains(userName))
			System.out.println(userStatements);
			}
		}
	}
}
