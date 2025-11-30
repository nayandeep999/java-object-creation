package com.kodewala.object;

class Animal {
	String type = "Generic Animal"; // variable is NOT polymorphic (used based on reference type)

	void sound() { // method can be overridden (polymorphic)
		System.out.println("Animal sound");
	}
}

class Dog extends Animal {
	String type = "Dog"; // this hides the parent variable, not override

	@Override
	void sound() { // overridden method (chosen at runtime)
		System.out.println("Dog barks");
	}
}

public class Zoo {
	public static void main(String[] args) {
		Animal a = new Dog(); // reference is Animal, object is Dog
		System.out.println(a.type); // prints "Generic Animal" because fields use reference type
		a.sound(); // prints "Dog barks" because methods use actual object type
	}
}
