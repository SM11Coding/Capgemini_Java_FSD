package com.cg_AList;

import java.util.ArrayList;

public class CreatingStringArrayList
{
	public static void main(String[]Args)
	{
		ArrayList<String> languages = new ArrayList<>();
		
		//add elements in the array list
		
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("C++");
		
		System.out.println("ArrayList : "+ languages);
		
		//change the element of the array list
		
		languages.set(2, "JavaScript");
		System.out.print("Modified ArrayList: "+languages);
	}
}
