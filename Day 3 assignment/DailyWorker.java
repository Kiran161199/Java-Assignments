package com.kiran;

public class DailyWorker extends Worker{
	
	@Override
	public void pay(int hours) {	
		int	numberOfDays=hours/8;
		double weeklyPay=numberOfDays*getSalaryRate();
		System.out.println("Weekly pay of Daily Worker : "+weeklyPay);
	}

}
