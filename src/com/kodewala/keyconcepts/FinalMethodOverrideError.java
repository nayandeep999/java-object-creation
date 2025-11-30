package com.kodewala.keyconcepts;

class FinalParent {
	final void run() {
		System.out.println("Running");
	}
}

class FinalChild extends FinalParent {
	// void run() {} // ERROR: cannot override final method
}

public class FinalMethodOverrideError {
	public static void main(String[] args) {
	}
}
