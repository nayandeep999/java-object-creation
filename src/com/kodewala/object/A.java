package com.kodewala.object;

public class A {

	static {
		System.out.println("1.This is static block from - A");
	}

	static {
		System.out.println("2.This is static block from - A");
	}

	{
		System.out.println("1.This is IIB from - A");
	}

	{
		System.out.println("2.This is IIB from - A");
	}

	A() {
		System.out.println("This is A constructor");
	}

	public static void main(String[] args) {

		A a = new A();

	}

}
