package com.training.assignment41;

public class Circle extends Shape {
	private int radius;

	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 2 * Math.PI * radius;
	}
}
