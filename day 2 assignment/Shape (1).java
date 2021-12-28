package com.Kiran.programs;

public class Shape {
	public void perimeter(int l,int b) {
		int perimeter= (l+b)*2;
		System.out.println("Perimeter of Rectangle : "+perimeter);
		}
	
	public void perimeter(int side) {
		int perimeter=side*4;
		System.out.println("Perimeter of Square : "+perimeter);
	}
}
