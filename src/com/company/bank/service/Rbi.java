package com.company.bank.service;

public interface Rbi {
	void withdraw(double amount);
	void deposit(double amount);
	void displayBalance();
    void addStatements();
    void getComplaints();
    void amountTransaction();
}
