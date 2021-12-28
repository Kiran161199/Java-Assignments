package com.rocky.program;

public class MainCalculator {
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(10, 20);
		cal.add(10.0,20.0);
		cal.add(10, 20.0);
		cal.add(10.0, 20);
		System.out.println("-----------------------------------");
		cal.diff(10, 20);
		cal.diff(10.0,20.0);
		cal.diff(10, 20.0);
		cal.diff(10.0, 20);
		System.out.println("-----------------------------------");
		cal.mul(10, 20);
		cal.mul(10.0,20.0);
		cal.mul(10, 20.0);
		cal.mul(10.0, 20);
		System.out.println("-----------------------------------");
		cal.div(10, 20);
		cal.div(10.0,20.0);
		cal.div(10, 20.0);
		cal.div(10.0, 20);
		System.out.println("-----------------------------------");
	}
}
