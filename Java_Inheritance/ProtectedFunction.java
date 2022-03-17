package com.cg;

class Animal {
    // protected method
    protected void display() {
        System.out.println("I am an animal");
    }
}

class ProtectedFunction extends Animal {
    public static void main(String[] args) {

        // create an object of Dog class
         ProtectedFunction dog = new ProtectedFunction();
         // access protected method
        dog.display();
    }
}
