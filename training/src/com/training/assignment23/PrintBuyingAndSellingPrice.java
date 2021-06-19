package com.training.assignment23;

import java.util.Scanner;

public class PrintBuyingAndSellingPrice {

	public static void getBuyingAndSellingPrice(double buyingPrice, double sellingPrice) {
		System.out.println("Buying price is " + buyingPrice + " Selling price is " + sellingPrice);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Buying Price :: ");
		double buyingPrice = in.nextDouble();
		System.out.println("Enter Selling Price :: ");
		double sellingPrice = in.nextDouble();
		getBuyingAndSellingPrice(buyingPrice, sellingPrice);
		in.close();
	}

}
