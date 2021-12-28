package com.kiran.program;

public class Cube extends Shape3D {
		private int side;
		
		public Cube(int side) {
			super();
			this.side=side;
		}
		
		public int getRadius() {
			return side;
		}
		
		public int getHeight() {
			return side;
		}

		@Override
		void volume() {
			double volume=side*side*side;
			System.out.println("the volume of cube is :"+volume);
			}

		@Override
		void surfaceArea() {
			double surfaceArea=6*side*side;
			System.out.println("the surfaceArea of cube is :"+surfaceArea);
		}

	}

