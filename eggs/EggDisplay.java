package com.eggs;

public class EggDisplay {
private int total;
private int gross=144;
private int dozen=12;
private int numberOfGross;
private int numberOfDozen;
private int remainingOfEggs=0;

public int getNumberOfDozen() {
	dozenCalculation();
	return numberOfDozen;
}
public int getNumberOfGross() {
	grossCalculation();
	return numberOfGross;
}
public int getRemainingOfEggs() {
	return remainingOfEggs;
}

public void setTotal(int total) {
	this.total = total;
}

public void grossCalculation() {
	numberOfGross=total/gross;
	remainingOfEggs=total%gross;
}
public void dozenCalculation(){
	if(remainingOfEggs>=12) {
		numberOfDozen=remainingOfEggs/dozen;
		remainingOfEggs=remainingOfEggs%dozen;
	}
}
}
