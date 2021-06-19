package com.training.assignment41;

public class Rectangle extends Shape {
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		return length * breadth;
	}
}
