package com.training.assignment39;

public class Account {
	private String accountNumber;
	private int balance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int transactionAmount) {
		balance += transactionAmount;
		System.out.println("Your balance after transaction is ::::::: "+balance);
	}

	public void withdraw(int transactionAmount) {
		if ((balance - transactionAmount) > 0) {
			balance -= transactionAmount;
			System.out.println("Your balance after transaction is ::::::: "+balance);
		} else {
			System.out.println("Insufficient Balance. Your balance after transaction is :::::: "+balance);
		}
	}
}
