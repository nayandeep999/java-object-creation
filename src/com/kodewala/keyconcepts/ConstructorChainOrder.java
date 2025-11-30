package com.kodewala.keyconcepts;

class AccountA {
	AccountA() {
		System.out.println("Account created");
	}
}

class SavingsAccount extends AccountA {
	SavingsAccount() {
		System.out.println("SavingsAccount created");
	}
}

public class ConstructorChainOrder {
	public static void main(String[] args) {
		new SavingsAccount(); // Parent constructor first, then child
	}
}
