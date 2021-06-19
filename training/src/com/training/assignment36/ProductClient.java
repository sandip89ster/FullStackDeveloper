package com.training.assignment36;

import java.util.Scanner;

public class ProductClient {
	public static void getProductDetails(long id, String productName, String supplierName) {
		Product product = new Product();
		product.setId(id);
		product.setProductName(productName);
		product.setSupplierName(supplierName);
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
