package com.kodewala.object;

public class Parent2 {

	int x = 10;
	int y = 10;

	static {
		System.out.println("[Parent2] Static block executed");
	}

	{
		System.out.println("[Parent2] Instance initializer block executed (x=" + x + ", y=" + y + ")");
	}

	Parent2() {
		System.out.println("[Parent2] Constructor started");
		show(); // dynamic dispatch — calls child's show() if child object is being created
		System.out.println("[Parent2] Constructor finished");
	}

	void show() {
		System.out.println("[Parent2] show(): x = " + x);
	}

	public static void main(String[] args) {
		new Child();
	}
}

class Child extends Parent2 {

	static {
		System.out.println("[Child] Static block executed");
	}

	{
		System.out.println("[Child] Instance initializer block executed (before initializing child’s x)");
	}

	int x = 20;

	Child() {
		System.out.println("[Child] Constructor executed");
	}

	@Override
	void show() {
		System.out.println("[Child] show(): x = " + x);
	}
}

class Child3 extends Parent2 {

	static {
		System.out.println("[Child3] Static block executed");
	}

	{
		System.out.println("[Child3] Instance initializer block executed");
	}

	int x = 20;

	Child3() {
		System.out.println("[Child3] Constructor executed");
	}

	@Override
	void show() {
		System.out.println("[Child3] show(): x = " + x);
	}
}
