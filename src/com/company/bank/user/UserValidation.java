package com.company.bank.user;

import com.company.bank.data.UserData;
import com.company.bank.data.UserService;
import java.util.*;
public class UserValidation {
	String userName;
	String password;
	
	Scanner sc=new Scanner(System.in);
	UserData currentUser;
	public UserData validateUser(String userName,String password)
	{
		
		for(UserData data:UserService.list)
		{
			if(data.getUserName().equals(userName) && data.getUserPassword().equals(password))
			{
				return data;
			}
		}
		return null;
	}
	public void userVerification()
	{
		System.out.println("Enter username");
		userName=sc.next();
		System.out.println("Enter password");
		password=sc.next();
		currentUser=validateUser(userName,password);
		if(currentUser!=null)
		{
			System.out.println("Successful login");
			UserAccess access=new UserAccess(currentUser);
			
		}
		else
		{
			System.out.println("UnSuccessful login");
		}
	}
}
