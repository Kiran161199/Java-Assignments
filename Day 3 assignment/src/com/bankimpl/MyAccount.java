package com.bankimpl;

public class MyAccount {
	public static void main(String[] args) {
	SavingsAcc sa=new SavingsAcc();
	sa.display();
	System.out.println("----------------------------------------------");
	FdAcc fd=new FdAcc();
	fd.display();
	System.out.println("----------------------------------------------");
	PersonalLoanAcc pl=new PersonalLoanAcc();
	pl.display();
	System.out.println("----------------------------------------------");
	HousingLoanAcc hlc=new HousingLoanAcc();
	hlc.display();
 }
}
