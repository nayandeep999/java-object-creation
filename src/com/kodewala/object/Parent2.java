package com.kodewala.object;

public class Parent2 {

	int x = 10;

	Parent2() {
		System.out.println("This is parent constructor");
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

	int x = 20;

	Child() {
		System.out.println("This is child constructor");
	}

	void show() {

		System.out.println("The value of x is: " + x);

	}

}
