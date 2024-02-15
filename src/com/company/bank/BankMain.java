package com.company.bank;

import java.util.*;

import com.company.bank.admin.*;


import com.company.bank.user.UserValidation;
public class BankMain {
	
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number;
    boolean flag=false;
    do {
       System.out.println("1.Admin");
       System.out.println("2.User");
       number=sc.nextInt();
       if(number==1)
       {
          AdminValidation admin=new AdminValidation();
          admin.adminAccess();
       }
       else {
    	   UserValidation user=new UserValidation();
    	   user.userVerification();
       }
       sc.nextLine();
      System.out.println("Do u want to continue:");
      char choice=sc.next().charAt(0);
      if(choice=='y')
      {
    	  flag=true;
      }
      else
      {
    	  flag=false;
      }
       
    }while(flag);
    sc.close();
    }
}
