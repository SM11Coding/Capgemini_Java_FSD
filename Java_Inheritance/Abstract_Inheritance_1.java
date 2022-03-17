package com.cg;

abstract class Language {

	  // method of abstract class
	  public void display() {
	    System.out.println("This is Java Programming");
	  }
	}

	class Main extends Language {

	  public static void main(String[] args) {
	    
	    // create an object of Main
	    Main obj = new Main();

	    // access method of abstract class
	    // using object of Main class
	    obj.display();
	  }
	}



	abstract class MotorBike {
	  abstract void brake();
	}

	class SportsBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() {
	    System.out.println("SportsBike Brake");
	  }
	}

	class MountainBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() {
	    System.out.println("MountainBike Brake");
	  }
	}

	class Abstract_Inheritance_1 {
	  public static void main(String[] args) {
	    MountainBike m1 = new MountainBike();
	    m1.brake();
	    SportsBike s1 = new SportsBike();
	    s1.brake();
	  }
	}
