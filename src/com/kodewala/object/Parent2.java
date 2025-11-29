package com.kodewala.object;

public class Parent2 {

	int x = 10;
	int y = 10;

	static {
		System.out.println("Static from parent");
	}

	{
		System.out.println("IIB - Already initialized x & y values from parent b/c they executed before IIB");
	}

	Parent2() {
		System.out.println("Third line from parent constructor");
		show();

	}

	void show() {

		System.out.println("The value of x is: " + x);

	}

	public static void main(String[] args) {
		new Child();
	}

}

class Child extends Parent2 {

	static {
		System.out.println("Static from child");
	}

	{
		System.out.println("IIB - Executing IIB before initializing x");
	}

	int x = 20;

	Child() {
		System.out.println("Third line from child constructor");
	}

	void show() {

		System.out.println("The value of x is: " + x);

	}

}

class Child3 extends Parent2 {

	static {
		System.out.println("Static from child3");
	}

	{
		System.out.println("Initializing values from child3");
	}

	int x = 20;

	Child3() {
		System.out.println("This is child3 constructor");
	}

	void show() {

		System.out.println("The value of x is: " + x);

	}

}