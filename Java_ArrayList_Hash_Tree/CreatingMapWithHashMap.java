package com.cg_AList;

import java.util.*;

public class CreatingMapWithHashMap
{
	public static void main(String[]Args) {
	//Creating a map using the HashMap
	Map<String,Integer> numbers = new HashMap<>();
	
	//Insert elements to the map
	numbers.put("One",1);
	numbers.put("Five",5);
	numbers.put("Two",2);
	System.out.println("Map: "+ numbers);
	
	//Access Keys of the map
	System.out.println("Keys :" + numbers.keySet());
	
	//Access values of the map
	System.out.println("Values: "+ numbers.values());
}
}
