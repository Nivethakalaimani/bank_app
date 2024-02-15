package com.company.bank.data;
import java.util.*;
public class UserService {
	public static LinkedList<UserData> list=new LinkedList<>();
	static {
		
		UserData user1=new UserData("Raj","12345","User",10000);
		UserData user2=new UserData("Ram","12345","Admin",0);
		UserData user3=new UserData("Raja","12345","User",10000);
		UserData user4=new UserData("John","12345","User",10000);
		UserData user5=new UserData("Joy","12345","User",10000);
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		
	}

	public UserData checkIfUserExists(String userName, String password,String type) {
		for(UserData user:list) {
		if(user.getUserName().equals(userName) && user.getUserPassword().equals(password)
				&& type.equals(user.getRole()))
		{
			return user;
		}
		}
		
		return null;
	}

	public UserData addUser(UserData user) {
        UserData data=checkIfUserExists(user.getUserName(),user.getUserPassword(),user.getRole());
        if(data!=null)
        	return null;
        else
        
        	list.add(user);
        
        
		return user;
	}

	public boolean removeUser(String userName) {
		UserData flag=checkIfUserExists(userName);
		if(flag!=null)
		{
			for(UserData user:list)
			{
				if(user.getUserName().equals(userName))
				{
					list.remove(user);
					return true;
				}
			}
		}
			
		return false;
	}

	public boolean checkRole(String roleName) {
		for(UserData user:list) {
			if(user.getRole().equals(roleName) )
			{
				return true;
			}
			}

		return false;
	}

	public UserData checkIfUserExists(String userName) {
		for(UserData user:list) {
			if(user.getUserName().equals(userName) )
			{
				return user;
			}
			}
		return null;
	}
	

}
