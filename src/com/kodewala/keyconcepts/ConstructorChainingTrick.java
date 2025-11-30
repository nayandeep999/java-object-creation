package com.kodewala.keyconcepts;

class ChainA {

	// Instance initializer block (runs before ANY constructor)
	{
		System.out.println("ChainA instance block");
	}

	ChainA() {
		System.out.println("ChainA no-arg");
	}

	ChainA(int x) {
		this(); // calls ChainA()
		System.out.println("ChainA int");
	}
}

class ChainB extends ChainA {

	ChainB() {
		super(10); // calls ChainA(int)
		System.out.println("ChainB no-arg");
	}
}

public class ConstructorChainingTrick {
	public static void main(String[] args) {
		new ChainB();
	}
}
