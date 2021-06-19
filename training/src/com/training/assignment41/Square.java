package com.training.assignment41;

public class Square extends Shape {
	private int side;

	public Square(int side) {
		super("Square");
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return side * side;
	}
}
