package com.training.assignment35;

import java.util.Scanner;

public class ProfitAndLossWithMethods {
	public static void calculateProfit(double toysPurchasedDozen, double ratePerDozen, double sellingPrice) {
		double costPriceOfAToy = ratePerDozen / 12;
		double profit = sellingPrice - costPriceOfAToy;
		float profitPercentage = (float) ((profit / costPriceOfAToy) * 100);
		System.out.println("number of dozens of toys purchased " + toysPurchasedDozen + " price per dozen "
				+ ratePerDozen + " selling price of 1 toy " + sellingPrice + " Sam's profit percentage is "
				+ profitPercentage + " percent");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double toysPurchasedDozen, ratePerDozen, sellingPrice;
		System.out.println("Dozens of toys purchased ::::: ");
		toysPurchasedDozen = in.nextDouble();
		System.out.println("Rate per dozen :::: ");
		ratePerDozen = in.nextDouble();
		System.out.println("Selling price per toy :::: ");
		sellingPrice = in.nextDouble();
		in.close();
		calculateProfit(toysPurchasedDozen, ratePerDozen, sellingPrice);
	}
}
