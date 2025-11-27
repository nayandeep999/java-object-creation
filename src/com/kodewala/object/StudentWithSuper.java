package com.kodewala.object;

public class StudentWithSuper extends Status {

	StudentWithSuper() {
		super(); // calls Status()
	}

	// 2. Constructor with email
	StudentWithSuper(String email) {
		super(email); // calls Status(String)
	}

	// 3. Constructor with email + course
	StudentWithSuper(String email, String course) {
		super(email, course); // calls Status(String, String)
	}

	// 4. Constructor with email + course + amount
	StudentWithSuper(String email, String course, int amount) {
		super(email, course, amount); // calls Status(String, String, int)
	}

	public static void main(String[] args) {

		StudentWithSuper s1 = new StudentWithSuper();

		StudentWithSuper s2 = new StudentWithSuper("arjun.sharma@gmail.com");

		StudentWithSuper s3 = new StudentWithSuper("meera.iyer@yahoo.com", "Java Full Stack");

		StudentWithSuper s4 = new StudentWithSuper("rahul.verma@outlook.com", "Data Science", 35000);

	}

}
