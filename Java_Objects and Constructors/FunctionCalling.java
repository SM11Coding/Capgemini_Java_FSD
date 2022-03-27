package com.cg;

class Test_this {
	 
    void print()
    {
        // calling fuctionshow()
       this.show();
 
       System.out.println("Test_this:: print");
    }
 
    void show() {
        System.out.println("Test_this::show");
    }
}
 
public class FunctionCalling{    
    public static void main(String args[]) {
        Test_this t1 = new Test_this();
        t1.print();
    }
}

