package com.kiran.program;

public class Sphere extends Shape3D {
		private int radius;
		
		
		
		public Sphere(int radius) {
			this.radius = radius;
		}
		
		public int getRadius() {
			return radius;
		}
		
		@Override
		void volume() {
			double volume=4/3*(3.14*radius*radius*radius);
			System.out.println("the volume of Sphere is :"+volume);
			}

		@Override
		void surfaceArea() {
			double surfaceArea=4*3.14*radius*radius;
			System.out.println("the surfaceArea of Sphere is :"+surfaceArea);
		}

	}

