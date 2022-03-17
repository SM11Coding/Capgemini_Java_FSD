package com.cg_AList;
import java.util.*;
public class LinkedHashMapEven
{

	public static void main(String[] args)
	{
		// CreatingLinked HashMap
		LinkedHashMap<String,Integer> evenNumbers = new LinkedHashMap<>();
		evenNumbers.put("Two",2);
		evenNumbers.put("Five", 5);
		evenNumbers.put("Four", 4);
		
		System.out.println("LinkedHashMap1: " + evenNumbers);

        // Creating a LinkedHashMap from other LinkedHashMap
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap2: " + numbers);

	}

}
