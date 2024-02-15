package com.company.bank.data;

public class UserData {
	  private String userName;
	  private  String userPassword;
	   private String role;
	    
	    double userAmount;
	    public UserData()
	    {
	    	
	    }
	    public UserData(String userName,String userPassword,String role,double userAmount ) {
	    	this.userName=userName;
	    	this.userPassword=userPassword;
	    	this.role=role;
	    	
	    	this.userAmount=userAmount;
	    	
	    }
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public double getUserAmount() {
			return userAmount;
		}
		public void setUserAmount(double userAmount) {
			this.userAmount = userAmount;
		}
}
