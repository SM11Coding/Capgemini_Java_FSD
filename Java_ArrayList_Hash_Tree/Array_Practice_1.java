package practice1;

import java.util.*;
public class Array_Practice_1 {
	
	List<String> input()
	{
		List<String> arr = new ArrayList<String>();
		//Scanner sc = new Scanner(System.in);
		
		arr.add("Red");
		arr.add("Green");
		arr.add("Blue");
		return arr;
		
		
	}
	
	void output(List<String> out)
	{
		out.add(0,"yellow");
		System.out.print(out);
		/*for(String elements: out)
			System.out.println(elements);*/
	}
	
	public static void main(String[]Args)
	{
		Array_Practice_1 a = new Array_Practice_1();
		a.output(a.input());
		
	}
}
