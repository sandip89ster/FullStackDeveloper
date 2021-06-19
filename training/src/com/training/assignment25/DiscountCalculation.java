package com.training.assignment25;

import java.util.Scanner;

public class DiscountCalculation {

	public static void getDiscountedRates(float item1, float item2, int discount) {
		float total = item1 + item2;
		float reduction = total / 10;
		float finalValue = total - reduction;
		System.out.println(
				"Total amount : $" + total + " Discounted amount : $" + finalValue + " Saved amount : $" + reduction);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float item1, item2;
		int discount;
		System.out.println("Price of item 1 ::::: ");
		item1 = in.nextFloat();
		System.out.println("Price of item 2 :::: ");
		item2 = in.nextFloat();
		System.out.println("Discount	    :::: ");
		discount = in.nextInt();
		in.close();
		getDiscountedRates(item1, item2, discount);
	}

}
