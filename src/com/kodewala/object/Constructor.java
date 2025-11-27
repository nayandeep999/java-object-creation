package com.kodewala.object;

public class Constructor {

	Constructor() {
		System.out.println("This is no args constructor");
	}

	Constructor(String name) {
		this();
		System.out.println(name);
	}

	public static void main(String[] args) {

		Constructor cc = new Constructor("iphone");
	}

}

//1. CONSTRUCTOR
//2. Used to create an object
//3. Helps us initialize and inject state (variables)
//4. If we do not provide a constructor, the compiler will provide a default constructor
//5. The default constructor will be a no-args constructor
//6. If you provide any constructor, the compiler will not provide the default constructor
//7. The first line of a constructor must be either super() or this()
//8. If you do not write super() or this() as the first line, the compiler will insert super() with no arguments
//9. We use this() to call another constructor in the same class
//10. Object class is the superclass of every class
//11. Using super() or this(), we can achieve constructor chaining
//12. For every object creation, constructor chaining is executed and it calls all constructors up to the Object class
