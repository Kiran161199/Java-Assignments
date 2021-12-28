package com.kiran;

abstract public class Worker {
	private String name;
	private double salaryRate;

	public String getName() {
		return name;
	}

	public double getSalaryRate() {
		return salaryRate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}

	abstract public void pay(int hours);
}
