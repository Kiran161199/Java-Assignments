package com.rocky.program;

public class Calculator {
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum "+sum);
	}
	public void add(double a,double b)
	{
		double sum=a+b;
		System.out.println("Sum "+sum);
	}
	public void add(int a,double b)
	{
		double sum=a+b;
		System.out.println("Sum "+sum);
	}
	public void add(double a,int b)
	{
		double sum=a+b;
		System.out.println("Sum "+sum);
	}
	public void diff(int a,int b)
	{
		int sub=a-b;
		System.out.println("Sub "+sub);
	}
	public void diff(double a,double b)
	{
		double sub=a-b;
		System.out.println("Sub "+sub);
	}
	public void diff(int a,double b)
	{
		double sub=a-b;
		System.out.println("Sub "+sub);
	}
	public void diff(double a,int b)
	{
		double sub=a-b;
		System.out.println("Sub "+sub);
	}
	public void mul(int a,int b)
	{
		int mul=a*b;
		System.out.println("Mul "+mul);
	}
	public void mul(double a,double b)
	{
		double mul=a*b;
		System.out.println("Mul "+mul);
	}
	public void mul(int a,double b)
	{
		double mul=a*b;
		System.out.println("Mul "+mul);
	}
	public void mul(double a,int b)
	{
		double mul=a*b;
		System.out.println("Mul "+mul);
	}
	public void div(int a,int b)
	{
		if(b>0 && a>b || a==b) {
		int div=a/b;
		System.out.println("Div "+div);
		}
	}
	public void div(double a,double b)
	{
		if(b>0) {
		double div=a/b;
		System.out.println("Div "+div);
		}
	}
	public void div(int a,double b)
	{
		if(b>0) {
		double div=a/b;
		System.out.println("Div "+div);
		}
	}
	public void div(double a,int b)
	{
		if(b>0) {
		double div=a/b;
		System.out.println("Div "+div);
		}
	}
}
