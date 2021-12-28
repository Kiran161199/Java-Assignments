package com.rocky.program;

public class Bus extends Vehicle {
	public Bus(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		this.setColor(color);
		this.setNoOfWheels(noOfWheels);
		this.setModel(model);
	}
	
	public void display() {
		System.out.println("Bus color is :"+getColor());
		System.out.println("Bus no of wheels is :"+getNoOfWheels());
		System.out.println("Bus model is :"+getModel());
	}

	public void commute() {
		System.out.println("Bus start commute");
	}
	
	public void vehicleType() {
		System.out.println("Bus is lite-weight type vehicle");
	}
	
	public void engine() {
		System.out.println("Bus is diesel or petrol engine");
	}
}
