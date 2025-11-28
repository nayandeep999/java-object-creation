package com.kodewala.object;

public class Parent {

	static {
		System.out.println("Static - Parent");
	}

	public static void main(String[] args) {
		new Child1();

	}

}

class Child1 extends Parent {

	static {
		System.out.println("Static - Child-1");
	}
}

class Child2 extends Child1 {

	static {
		System.out.println("Static - Child-2");
	}
}
