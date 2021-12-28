package com.kiran;

public class WorkerMain {
	public static void main(String[] args) {
		DailyWorker dw=new DailyWorker();
		dw.setName("Kiran Kumar L");
		dw.setSalaryRate(1000.0);
		dw.pay(60);
		
		SalariedWorker sw= new SalariedWorker();
		sw.setName("Gangadhar");
		sw.setSalaryRate(1000.0);
		dw.pay(40);
		
	}
}
