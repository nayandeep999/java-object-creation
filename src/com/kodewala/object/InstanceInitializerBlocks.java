package com.kodewala.object;

class UserA {
	{
		System.out.println("User instance block");
	}

	UserA() {
		System.out.println("User constructor");
	}
}

class AdminUser extends UserA {
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
