package com.kodewala.object;

class User {
	static {
		System.out.println("User static block");
	}
	{
		System.out.println("User instance block");
	}

	User() {
		System.out.println("User constructor");
	}
}

class Admin extends User {
	static {
		System.out.println("Admin static block");
	}
	{
		System.out.println("Admin instance block");
	}

	Admin() {
		System.out.println("Admin constructor");
	}
}

public class LoginTest {
	public static void main(String[] args) {
		new Admin();
		System.out.println("-----");
		new Admin();
	}
}
//1.user static 2.admin static 3.user instance 4. user constructor 5.admin instance 6. admin constructor ------ repeat from 3 to 6