package com.cg_AList;

import java.util.*;
public class ArrayListIterator
{
	public static void main(String[]Args)
	{
		//Creating An arrayList
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        //Creating an iterator instance
        Iterator<Integer> iterate = numbers.iterator();
        
     // Using the next() method
        int number = iterate.next();
        System.out.println("Accessed Element: " + number);

        // Using the remove() method
        iterate.remove();
        System.out.println("Removed Element: " + number);

        System.out.print("Updated ArrayList: ");

        // Using the hasNext() method
        while(iterate.hasNext()) {
            // Using the forEachRemaining() method
            iterate.forEachRemaining((value) -> System.out.print(value + ", "));

        
        }
	}
}
