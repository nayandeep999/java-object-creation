package com.kodewala.keyconcepts;

class Engine {
	static {
		System.out.println("Engine static block");
	}
}

class DieselEngine extends Engine {
	static {
		System.out.println("DieselEngine static block");
	}
}

public class StaticBlockOrder {
	public static void main(String[] args) {
		DieselEngine e = new DieselEngine(); // Static blocks run once when class loads
	}
}
