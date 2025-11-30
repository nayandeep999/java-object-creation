package com.kodewala.object;

class Library {
	// Static method in parent class
	// Static methods belong to the class, not objects
	static void info() {
		System.out.println("Info from Library");
	}
}

class DigitalLibrary extends Library {
	// This is NOT method overriding — it is method HIDING
	// because static methods cannot be overridden.
	static void info() {
		System.out.println("Info from DigitalLibrary");
	}
}

public class BookApp {
	public static void main(String[] args) {

		// Reference type is Library, object is DigitalLibrary
		// But static methods are chosen based on REFERENCE TYPE
		// So this will call Library.info(), not DigitalLibrary.info()

		Library l = new DigitalLibrary();
		l.info(); // Output: "Info from Library"

//		DigitalLibrary l = new DigitalLibrary();
//		l.info(); // Output: "Info from DigitalLibrary"

		// Recommended way: call static methods using class names
		// This directly calls the static method in DigitalLibrary
		DigitalLibrary.info(); // Output: "Info from DigitalLibrary"
	}
}
