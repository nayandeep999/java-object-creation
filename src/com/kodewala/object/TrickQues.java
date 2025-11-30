package com.kodewala.object;

class Mom {
	static {
		System.out.println("Static block of Mom");
	}

	{
		System.out.println("Instance block of Mom");
	}

	int age = 40;

	Mom() {
		System.out.println("Constructor of Mom");
		showAge();
	}

	void showAge() {
		System.out.println("Mom's age = " + age);
	}
}

class Son extends Mom {
	static {
		System.out.println("Static block of Son");
	}

	{
		System.out.println("Instance block of Son");
	}

	int age = 18;

	Son() {
		System.out.println("Constructor of Son");
	}

	@Override
	void showAge() {
		System.out.println("Son's age = " + age);
	}
}

public class TrickQues {

	static {
		System.out.println("Static from TrickQues");
		// Whichever class the main method belongs to will load first
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		Mom child = new Son();
		System.out.println("Main ends");
	}
}