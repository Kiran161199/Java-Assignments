package com.rocky.program;

public class Road {

	public static void main(String[] args) {
		Vehicle truck=new Truck("cream", 10, "tata ace");
		truck.commute();
		truck.engine();
		truck.vehicleType();
		truck.display();
		System.out.println("--------------------------");
		Bus bus=new Bus("red", 6, "single deck");
		bus.commute();
		bus.engine();
		bus.vehicleType();
		bus.display();
		System.out.println("--------------------------");
		Car car=new Car("red", 4, "single deck");
		car.commute();
		car.engine();
		car.vehicleType();
		car.display();
		System.out.println("--------------------------");

	}

}
