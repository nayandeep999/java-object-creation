package com.kodewala.keyconcepts;

class OverloadDemo {

	// Overload #1 - accepts ANY reference type (superclass of everything)
	void test(Object o) {
		System.out.println("Object");
	}

	// Overload #2 - accepts only String (a more specific type)
	void test(String s) {
		System.out.println("String");
	}
}

public class CompileTimeOverloadingResolution {

	public static void main(String[] args) {

		OverloadDemo d = new OverloadDemo();

		/*
		 * EXPLANATION:
		 *
		 * When calling test(null):
		 *
		 * - 'null' can match ANY reference type. So both methods are possible matches:
		 *
		 * test(Object o) test(String s)
		 *
		 * BUT: Java must choose the MOST SPECIFIC method.
		 *
		 * - String is a subclass of Object. Therefore, String is more specific than
		 * Object.
		 *
		 * So Java selects: test(String s)
		 *
		 * This is a COMPILE-TIME decision (overloading resolution).
		 *
		 * Final Output: "String"
		 */

		d.test(null); // prints "String"
	}
}
