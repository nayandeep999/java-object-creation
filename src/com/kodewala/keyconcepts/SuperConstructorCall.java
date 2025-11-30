package com.kodewala.keyconcepts;

class SuperA {
	SuperA(int x) {
		System.out.println("SuperA: " + x);
	}
}

class SuperB extends SuperA {
	SuperB() {
		super(100); // Must be first
		System.out.println("SuperB constructor");
	}
}

public class SuperConstructorCall {
	public static void main(String[] args) {
		new SuperB();
	}
}
