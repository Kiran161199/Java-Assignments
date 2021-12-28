package com.kiran;

public class SalariedWorker extends Worker {

	public void pay(int hours) {
		double weeklyPay=0;
		if (hours <= 40) {
			weeklyPay=hours*getSalaryRate();
		}
		else {
			weeklyPay=40*getSalaryRate();
		}

		System.out.println("Weekly Pay of Salaried Worker"+weeklyPay);

	}
}
