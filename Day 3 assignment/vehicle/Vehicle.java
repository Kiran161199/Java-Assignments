package com.rocky.program;

public class Vehicle {
	private String color;
	private int noOfWheels;
	private String model;
	
	public Vehicle(String color, int noOfWheels, String model) {
		super();
		this.setColor(color);
		this.noOfWheels = noOfWheels;
		this.model = model;
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void commute() {
		
	}
	
	public void vehicleType() {
		
	}
	
	public void engine() {
		
	}
	
	public void display() {
		
	}

}
