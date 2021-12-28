package com.kiran.program;

public class MainClass {
  public static void main(String[] args) {
	Shape3D shape=new Cylinder(4,5);
	shape.volume();
	shape.surfaceArea();
	System.out.println("-----------------------------");
	shape=new Sphere(3);
	shape.volume();
	shape.surfaceArea();
	System.out.println("-----------------------------");
	shape =new Cube(4);
	shape.volume();
	shape.surfaceArea();
	System.out.println("-----------------------------");
}
 
}
