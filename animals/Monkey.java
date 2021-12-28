package org.animals;

public class Monkey extends Animal{
	public Monkey(String color,double weight,int age){
		this.color=color;
		this.weight=weight;
		this.age=age;
	}
	public void isVegetarian() {
		System.out.println("Monkey is  vegetarian");
	}
	public void canClimb() {
		System.out.println("Monkey can climb");
	}
	public void sound() {
		System.out.println("Monkey makes sound");
	}
}
