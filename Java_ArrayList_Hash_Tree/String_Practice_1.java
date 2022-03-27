package practice1;

//import java.util.*;

//import java.lang.*;

public class String_Practice_1 
{
	String helloName(StringBuilder str) 
	{
		String ns="";
		for(int i = 0 ; i< str.length(); i++)
		{
			char z = str.charAt((i));
			if(z != 'x')
			{
				ns = ns + z;
			}
		}
		 // str.append(" the builder");
		  return ns;
	}
	
	public static void main(String[]Args)
	{
		String s = "xBobx";
		String_Practice_1 p = new String_Practice_1();
		StringBuilder string = new StringBuilder(s);
		
		System.out.println(p.helloName(string));
		
	}
}
