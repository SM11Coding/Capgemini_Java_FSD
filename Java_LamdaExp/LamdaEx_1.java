package com.cg_Lamda;

@FunctionalInterface
interface MyInterface{//Abstract Class
		
	double getPiValue();//Abstract Method
}

public class LamdaEx_1
{
	public static void main(String[]Args)
	{
		MyInterface ref; //Declaring interface referene
		
		ref=()->3.145;
		
		System.out.print("Value of Pi: "+ ref.getPiValue());
		
	}
}

