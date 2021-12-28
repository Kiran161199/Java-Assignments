package com.rocky.program;

public class Truck extends Vehicle {

	public Truck(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		this.setColor(color);
		this.setNoOfWheels(noOfWheels);
		this.setModel(model);
	}
	
	public void display() {
		System.out.println("Truck color is :"+getColor());
		System.out.println("Truck no of wheels is :"+getNoOfWheels());
		System.out.println("Truck model is :"+getModel());
	}

	public void commute() {
		System.out.println("Truck start commute");
	}
	
	public void vehicleType() {
		System.out.println("Truck is heavy type vehicle");
	}
	
	public void engine() {
		System.out.println("Truck is diesel engine");
	}

}
