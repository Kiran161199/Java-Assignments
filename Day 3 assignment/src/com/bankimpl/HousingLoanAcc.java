package com.bankimpl;

import com.bank.DebitInterest;
import com.bank.LoanAcc;

public class HousingLoanAcc implements DebitInterest, LoanAcc {

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("Calculating the Interest of HousingLoan");

	}

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("Creating Housing Loan Account");

	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Repaying Principal Amount");

	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("paying the Interest");

	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("Repaying PartialPrincipalAmount");

	}

	@Override
	public void deductMonthlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Deducing Monthly Interest");

	}

	@Override
	public void deductHalfYearlyInt() {
		// TODO Auto-generated method stub
		System.out.println("Deducting HalfYearly Interest");

	}

	@Override
	public void deductAnnualInt() {
		// TODO Auto-generated method stub
		System.out.println("Deducting Annual Interest");

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
