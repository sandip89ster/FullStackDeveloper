package com.training.assignment37;

import java.util.Scanner;

public class ProductClient3ArgumentConstructor {
	public static void getProductDetails(long id, String productName, String supplierName) {
		Product product = new Product(id, productName, supplierName);
		product.print();
	}

	public static void main(String[] args) {
		long id;
		String product, supplier;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter product ID :::::: ");
		id = in.nextLong();
		product = in.nextLine();
		System.out.println("Enter product name :::: ");
		product = in.nextLine();
		System.out.println("Enter supplier name ::: ");
		supplier = in.nextLine();
		in.close();
		getProductDetails(id, product, supplier);
	}
}
