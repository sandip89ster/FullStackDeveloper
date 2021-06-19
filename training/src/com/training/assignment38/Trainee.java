package com.training.assignment38;

public class Trainee {
	private static final String BATCH_CODE = "CHNFSD";
	private int id;
	private String name;

	public Trainee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(id + " " + name + " " + BATCH_CODE);
	}

}
