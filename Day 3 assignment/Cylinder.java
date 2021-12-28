package com.kiran.program;

public class Cylinder extends Shape3D {
	private int radius;
	private int height;
	
	
	public Cylinder(int radius, int height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public int getHeight() {
		return height;
	}

	@Override
	void volume() {
		double volume=3.14*radius*2*height;
		System.out.println("the volume of cylinder is :"+volume);
		}

	@Override
	void surfaceArea() {
		double surfaceArea=2*3.14*radius*height;
		System.out.println("the surfaceArea of cylinder is :"+surfaceArea);
	}

}
