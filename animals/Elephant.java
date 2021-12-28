package org.animals;

public class Elephant extends Animal{
	
	public Elephant(String color,double weight,int age){
		this.color=color;
		this.weight=weight;
		this.age=age;
	}
	public void isVegetarian() {
		System.out.println("Elephant is  vegetarian");
	}
	public void canClimb() {
		System.out.println("Elephant cannot climb");
	}
	public void sound() {
		System.out.println("Elephant makes sound");
	}
}
