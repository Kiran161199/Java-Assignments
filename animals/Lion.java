package org.animals;

public class Lion extends Animal {
	
	public Lion(String color,double weight,int age){
		this.color=color;
		this.weight=weight;
		this.age=age;
	}
	public void isVegetarian() {
		System.out.println("Lion is not vegetarian");
	}
	public void canClimb() {
		System.out.println("Lion cannot climb");
	}
	public void sound() {
		System.out.println("Lion Roar");
	}
}
