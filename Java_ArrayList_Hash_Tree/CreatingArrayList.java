package com.cg_AList;

import java.util.*;

public class CreatingArrayList
{
	public static void main(String[]Args)
	{
		//creating array list
		List<Integer> numbers = new ArrayList<>();
		
		//Add elements to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List: "+ numbers);
		
		//Access elements from list
		int number = numbers.get(2);
		System.out.println("Accessed Element :" + number);
		
		//Remove element from the list
		int removedNumber = numbers.remove(1);
		System.out.println("Remove Element: "+ removedNumber);
	}
}
