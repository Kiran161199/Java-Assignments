package com.rocky.program;

public class City {
	public static void main(String[] args) {
		Vehicle truck=new Truck("white", 10, "Tata-Ace");
		truck.display();
		System.out.println("------------------------------");
		Vehicle bus=new Bus("red", 6, "Single deck");
		bus.display();
		System.out.println("------------------------------");
		Vehicle car=new Car("Blue", 10, "Brezza");
		car.display();
		System.out.println("------------------------------");
	}
}
