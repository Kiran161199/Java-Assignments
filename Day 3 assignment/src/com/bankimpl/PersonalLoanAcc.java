package com.bankimpl;

import com.bank.DebitInterest;
import com.bank.LoanAcc;

public class PersonalLoanAcc implements LoanAcc, DebitInterest {

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Creating PersonalLoanAccount");

	}

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("calculating interest");

	}

	@Override
	public void deductMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Deducting Monthly Interest");

	}

	@Override
	public void deductHalfYearlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Deducting HalfYearlyInterest");
	}

	@Override
	public void deductAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Deducting AnnualInterest");

	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Repaying Principal Amount");

	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("Repaying Interest of personal loan");

	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Repaying the partialPrincipal amount");

	}
	public void display() {
		createAcc();
		calculateInterest();
		repayPrincipal();
		payInterest();
		payPartialPrincipal();
		deductMonthlyInt();
		deductHalfYearlyInt();
		deductAnnualInt();
	}
}
