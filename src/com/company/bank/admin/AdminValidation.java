package com.company.bank.admin;
import java.util.*;
import com.company.bank.data.*;
public class AdminValidation {
	Scanner sc=new Scanner(System.in);
	String name;
	String password;
	String adminName;
	String adminPassword;
	UserData admin=new UserData();
	UserService service=new UserService();
	
    UserData adminValidate()
	{
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the password:");
		password=sc.next();
		admin=service.checkIfUserExists(name,password,"Admin");
		
		return admin;
	}
	
	public void adminAccess()
	{
		if(adminValidate()!=null)
		{
			UserService service=new UserService();
			boolean flag=false;
			System.out.println("Successful login");
			do {
			System.out.println("1.Add userDetails");
			System.out.println("2.Remove userDetails");
			System.out.println("3.Check user exists");
			int ch;
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			
			
			switch(ch)
			{
			
			case 1:
				String name,password;
			    double amount;
				System.out.println("Enter the name");
				name=sc.next();
				System.out.println("Enter the password");
				password=sc.next();
				System.out.println("Enter the deposit amount");
				amount=sc.nextDouble();
				UserData user=new UserData(name,password,"User",amount);
				service.addUser(user);
				System.out.println("UserDetaills has been successfully updated");
				break;
			
			case 2:
				String removeName;
				System.out.println("Enter the userName which you want to delete:");
				removeName=sc.next();
				service.removeUser(removeName);
				System.out.println("User is successfully removed");
				break;
			case 3:
				String checkName;
				System.out.println("Enter the name:");
				checkName=sc.next();
				if(service.checkIfUserExists(checkName)!=null)
					System.out.println("Yes ,The user exists");
				else
					System.out.println("No,The User doesn't exists");
				
			}
			System.out.println("Do u wnat to continue[y/n]:");
			char co=sc.next().charAt(0);
			
			if(co=='y')
			{
				flag=true;
			}
			else {
				flag=false;
				System.out.println("Successfully Logged out");}
			
		}while(flag);
		}
		else
		{
			System.out.println("Please enter valid username and password");
		}
		
	}
	
	
	
}
