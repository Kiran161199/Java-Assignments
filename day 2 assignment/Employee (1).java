package com.kiran.program;

public class Employee {
	String empName;
	int empId;
	int empAge;
	String empDesgn;
	String empLocation;
	int empExplnYrs;
	
	public Employee(String empName, int empId, int empAge, String empDesgn, String empLocation, int empExplnYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empDesgn = empDesgn;
		this.empLocation = empLocation;
		this.empExplnYrs = empExplnYrs;
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Age :"+empAge);
		System.out.println("Employee Designation :"+empDesgn);
		System.out.println("Employee Location :"+empLocation);
		System.out.println("Employee ExpYears :"+empExplnYrs);
	}

	public Employee(String empName) {
		super();
		this.empName = empName;
		System.out.println("Employee Name :"+empName);
	}

	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
		System.out.println("Employee Name :"+empName);
		System.out.println("Employee Id :"+empId);
	}
	
	
}
