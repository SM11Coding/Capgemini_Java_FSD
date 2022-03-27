package com.cg_Enums;

enum Season { SPRING, WINTER, SUMMER, FALL ;}

public class Enums_1{
	//defining enum within class
	
	//creating the main method
	public static void main(String[] args) {
	//printing all enum
	for (Season s : Season.values()){
	System.out.println(s);
	}
	System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));
	System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());
	System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());
	 
	}
	}