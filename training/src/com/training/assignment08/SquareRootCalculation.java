package com.training.assignment08;

public class SquareRootCalculation {

	public static int squareRootCalculation(double x1, double x2, double y1, double y2) {
		double calculation = ((x1 + x2) * (x1 + x2)) + ((y1 + y2) * (y1 + y2));
		return (int) Math.sqrt(calculation);
	}

	public static void main(String[] args) {
		double x1 = 5;
		double x2 = 6;
		double y1 = 8;
		double y2 = 3;
		System.out.println(squareRootCalculation(x1, x2, y1, y2));

	}

}
