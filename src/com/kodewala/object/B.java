package com.kodewala.object;

/*- 
 1.Class load A in metaspace
 2.Class load B in metaspace
 3.Static from A
 4.Static form B
 5.Main method
 6.IIB from A
 7.Constructor from A
 8.IIB from B
 9.Constructor from B
 * 
 * */

public class B extends A {

	static int aVariable;

	static {
		System.out.println("1.This is static block from - B");
//		aVariable = 10;
//		System.out.println(aVariable);
	}

	static {
		System.out.println("2.This is static block from - B");
//		aVariable = 10;
//		System.out.println(aVariable);
	}

	{
		System.out.println("1.This is IIB from - B");
	}

	{
		System.out.println("2.This is IIB from - B");
	}

	B() {
		System.out.println("This is B constructor");
	}

	public static void main(String[] args) {

		System.out.println("1.Inside main method");

		B b = new B();

		System.out.println("2.Inside main method");
	}

}

/*- 
 Static Variables form A
 Static IB from A
 Static Variables from B
 Static IB from B
 ----------------------------------
 IIB variables from A
 IIB from A
 Constructor from A
 ----------------------------------
 IIB variables from B
 IIB from B
 Constructor from B
 */
