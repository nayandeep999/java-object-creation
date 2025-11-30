package com.kodewala.keyconcepts;

class InitParent {
	static {
		System.out.println("Parent static");
	}
	int x = print("Parent instance variable");
	{
		print("Parent instance block");
	}

	InitParent() {
		print("Parent constructor");
	}

	int print(String msg) {
		System.out.println(msg);
		return 0;
	}
}

class InitChild extends InitParent {
	static {
		System.out.println("Child static");
	}
	int y = print("Child instance variable");
	{
		print("Child instance block");
	}

	InitChild() {
		print("Child constructor");
	}
}

public class OrderOfInitialization {
	public static void main(String[] args) {
		new InitChild();
	}
}
