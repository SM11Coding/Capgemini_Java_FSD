package practice1;
import java.util.*;
public class Hashmap_Practice_1 {
	
	HashMap<Integer,ArrayList<String>> input()
	{
		HashMap<Integer,ArrayList<String>> map = new HashMap<Integer,ArrayList<String>>();
		ArrayList<String> lst = new ArrayList<String>();
		
		lst.add("Mango");
		lst.add("Apple");
		map.put(1,lst);
		
		lst = new ArrayList<String>();
		lst.add("Orange");
		lst.add("Grapes");
		map.put(2,lst);
		
		lst = new ArrayList<String>();
		lst.add("Banana");
		lst.add("Guava");
		map.put(3,lst);
		
		return map;
	}
	
	void output(HashMap<Integer,ArrayList<String>> out)
	{
		//System.out.println(out);
		for(Map.Entry elements : out.entrySet())
			System.out.println(elements.getKey() + " , " + elements.getValue());
	}
	
	public static void main(String[]Args)
	{
		Hashmap_Practice_1 hp = new Hashmap_Practice_1();
		
		
		hp.output(hp.input());
	}
}
