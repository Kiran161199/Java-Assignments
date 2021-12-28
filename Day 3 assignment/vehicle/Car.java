package com.rocky.program;

public class Car extends Vehicle {
	public Car(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		this.setColor(color);
		this.setNoOfWheels(noOfWheels);
		this.setModel(model);

	}
	
	public void display() {
		System.out.println("Car color is :"+getColor());
		System.out.println("Car no of wheels is :"+getNoOfWheels());
		System.out.println("Car model is :"+getModel());
	}

	public void commute() {
		System.out.println("Car start commute");
	}
	
	public void vehicleType() {
		System.out.println("Car is lite-weight type vehicle");
	}
	
	public void engine() {
		System.out.println("Truck is diesel or petrol engine");
	}

}
