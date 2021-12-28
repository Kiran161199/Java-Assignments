package com.bankimpl;

import com.bank.CreditInterest;
import com.bank.DepositAcc;

public class FdAcc implements DepositAcc, CreditInterest {

		@Override
		public void createAcc() {
			// TODO Auto-generated method stub
			System.out.println("Creating FD Account");

		}

		@Override
		public void calculateInterest() {
			// TODO Auto-generated method stub
			System.out.println("calculating Interest");

		}

		@Override
		public void addMonthlyInt() {
			// TODO Auto-generated method stub
			System.out.println("claculating Monthly Interest");

		}

		@Override
		public void addHalfYearlyInt() {
			// TODO Auto-generated method stub
			System.out.println("Calculating HalfYearly Interest");

		}

		@Override
		public void addAnnualInt() {
			// TODO Auto-generated method stub
			System.out.println("Calculating yearly Interest");

		}

		@Override
		public void withdraw() {
			// TODO Auto-generated method stub
			System.out.println("Withdrawing Amount");

		}

		@Override
		public void deposit() {
			// TODO Auto-generated method stub
		System.out.println("Depositing Amount");

		}

		@Override
		public void getBalance() {
			// TODO Auto-generated method stub
		System.out.println("Getting balance of my account");

		}
	public void display() {
		createAcc();
		addMonthlyInt();
		addHalfYearlyInt();
		addAnnualInt(); 
		withdraw();
		deposit();
		getBalance();
	}	
}
