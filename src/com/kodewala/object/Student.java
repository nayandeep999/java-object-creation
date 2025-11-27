package com.kodewala.object;

public class Student {

	String email;
	String course;
	int amount;

	Student() {
		System.out.println("GUEST STUDENT");
	}

	Student(String _email) {
		this.email = _email;
		System.out.println("REGISTERED STUDENT - EMAIL ID: " + email);
	}

	Student(String _email, String _course) {
		this.email = _email;
		this.course = _course;
		System.out.println("ENROLLEDD STUDENT - EMAIL ID: " + email + " COURSE NAME: " + course);
	}

	Student(String _email, String _course, int _amount) {
		this.email = _email;
		this.course = _course;
		this.amount = _amount;
		System.out.println("PAID STUDENT - EMAIL ID: " + email + " COURSE NAME: " + course + " PAID: " + amount);
	}

	public static void main(String[] args) {

		Student s1 = new Student();

		Student s2 = new Student("arjun.sharma@gmail.com");

		Student s3 = new Student("meera.iyer@yahoo.com", "Java Full Stack");

		Student s4 = new Student("rahul.verma@outlook.com", "Data Science", 35000);

	}

}
