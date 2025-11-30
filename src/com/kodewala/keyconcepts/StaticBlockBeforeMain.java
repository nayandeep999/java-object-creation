package com.kodewala.keyconcepts;

public class StaticBlockBeforeMain {
	static {
		System.out.println("Static block executed");
	}

	public static void main(String[] args) {
		System.out.println("Main method executed");
	}
}
