package com.kodewala.keyconcepts;

class User {
	{
		System.out.println("User instance block");
	}

	User() {
		System.out.println("User constructor");
	}
}

class AdminUser extends User {
	{
		System.out.println("Admin instance block");
	}

	AdminUser() {
		System.out.println("Admin constructor");
	}
}

public class InstanceInitializerBlocks {
	public static void main(String[] args) {
		new AdminUser(); // Instance blocks run before constructors
	}
}
