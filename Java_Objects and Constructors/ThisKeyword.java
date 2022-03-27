package com.cg;

class this_test{
	int val1;
	int val2;
	
	//parameterized constructor
	this_test(int val1,int val2)
	{
		this.val1 = val1 + val1;
		this.val2 = val2 + val2;
	}
	
	void display()
	{
		System.out.println("Value val1= " + val1 + " Value val2= " + val2);
	}

}

class ThisKeyword{
	public static void main(String[]Args)
	{
		this_test obj = new this_test(5,10);
		obj.display();
	}
}
