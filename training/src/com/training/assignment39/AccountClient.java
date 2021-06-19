package com.training.assignment39;

import java.util.Scanner;

public class AccountClient {
	public static void main(String[] args) {
		int balance, amount, choice;
		String id;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter account number :::: ");
		id = in.nextLine();
		System.out.println("Enter account balance ::: ");
		balance = in.nextInt();
		System.out.println("Enter 1 to deposit an amount");
		System.out.println("Enter 2 to withdraw an amount");
		Account account = new Account();
		account.setAccountNumber(id);
		account.setBalance(balance);
		choice = in.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter amount to deposit :::::: ");
			amount = in.nextInt();
			account.deposit(amount);
			break;
		case 2:
			System.out.println("Enter amount to withdraw ::::: ");
			amount = in.nextInt();
			account.withdraw(amount);
			break;
		default:
			System.out.println("Enter valid input !!");
		}
		in.close();

	}
}
