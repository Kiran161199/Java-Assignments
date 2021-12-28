package com.eggs;

public class EggMainClass {
public static void main(String[] args) {
	EggDisplay e=new EggDisplay();
	e.setTotal(500);
	System.out.println("Number of eggs gross :"+e.getNumberOfGross());
	System.out.println("Number of eggs dozen :"+e.getNumberOfDozen());
	System.out.println("Number of eggs remaining :"+e.getRemainingOfEggs());
}
}
