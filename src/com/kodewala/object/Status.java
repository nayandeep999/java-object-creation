package com.kodewala.object;

public class Status {

	String email;
	String course;
	int amount;

	Status() {
		System.out.println("GUEST STUDENT");
	}

	Status(String _email) {
		this.email = _email;
		System.out.println("REGISTERED STUDENT - EMAIL ID: " + email);
	}

	Status(String _email, String _course) {
		this.email = _email;
		this.course = _course;
		System.out.println("ENROLLEDD STUDENT - EMAIL ID: " + email + " COURSE NAME: " + course);
	}

	Status(String _email, String _course, int _amount) {
		this.email = _email;
		this.course = _course;
		this.amount = _amount;
		System.out.println("PAID STUDENT - EMAIL ID: " + email + " COURSE NAME: " + course + " PAID: " + amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
