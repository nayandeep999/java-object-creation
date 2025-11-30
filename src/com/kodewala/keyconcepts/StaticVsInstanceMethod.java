package com.kodewala.keyconcepts;

class Vehicle {
	static void type() {
		System.out.println("General Vehicle");
	}

	void start() {
		System.out.println("Vehicle starting...");
	}
}

class Car extends Vehicle {
	static void type() {
		System.out.println("Car");
	}

	void start() {
		System.out.println("Car engine starting...");
	}
}

public class StaticVsInstanceMethod {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.type(); // Calls Vehicle.type() because static methods are resolved at compile time
		v.start(); // Calls Car.start() because instance methods are polymorphic
	}
}
