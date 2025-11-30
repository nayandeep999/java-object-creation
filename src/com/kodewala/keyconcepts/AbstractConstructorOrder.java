package com.kodewala.keyconcepts;

abstract class AbsBase {
	AbsBase() {
		System.out.println("AbsBase constructor");
	}
}

class AbsChild extends AbsBase {
	AbsChild() {
		System.out.println("AbsChild constructor");
	}
}

public class AbstractConstructorOrder {
	public static void main(String[] args) {
		new AbsChild();
	}
}

/*- 
1. Abstract class CANNOT be instantiated
   This is illegal:
   AbsBase a = new AbsBase();  // ❌ ERROR

   Because abstract means:
   - The class is not complete
   - It may contain abstract (unfinished) methods
   - Java cannot allow creation of an object whose behavior is incomplete
*/

/*
 * 2. But abstract class constructors STILL run Even though you can't do: new
 * AbsBase(); // ❌ (not allowed)
 * 
 * The constructor of an abstract class WILL still execute when a subclass
 * object is created. Example: new AbsChild(); // ✔ This will call AbsBase
 * constructor first
 */
