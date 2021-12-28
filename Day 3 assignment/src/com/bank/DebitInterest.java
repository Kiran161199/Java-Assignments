package com.bank;

public interface DebitInterest extends Interest {
	 void deductMonthlyInt();
	 void deductHalfYearlyInt();
	 void deductAnnualInt();
}
