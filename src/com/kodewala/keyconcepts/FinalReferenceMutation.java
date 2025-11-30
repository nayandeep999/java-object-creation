package com.kodewala.keyconcepts;

class Mutable {
	int value = 10;
}

public class FinalReferenceMutation {
	public static void main(String[] args) {
		final Mutable m = new Mutable();
		m.value = 20; // Allowed
		System.out.println(m.value);

		// m = new Mutable(); // ERROR: final reference cannot be reassigned
	}
}
