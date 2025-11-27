package com.kodewala.object;

public class InitBlocks {

	static { // SIB static initialization block - only runs once per class loading and
				// execute before main
				// method , (Runs once per class load.) | Used for one-time setup (e.g., loading
				// a database driver, reading a
				// configuration file once)., common activity for all the class

		System.out.println("Executing before the main method");

	}

	{ // IIB Instance Initialization Block - Runs per object creation (multiple times)
		// i.e. each object creation
		// will trigger this block | Used for common initialization logic shared across
		// all constructors (e.g., setting a default ID counter for every new object)
		System.out.println("Running before the object creation");
	}

	public InitBlocks() {
		// first line will either be super() or this()
		// second line is call to init block
		// third line is your custom logic / code
	}

	InitBlocks(int _age) {
		this("name");
		// this("India", "Banglore");

	}

	InitBlocks(String _name) {

	}

	InitBlocks(String _country, String _city) {

	}

	public static void main(String[] args) {

		InitBlocks init1 = new InitBlocks();
		InitBlocks init2 = new InitBlocks();
		InitBlocks init3 = new InitBlocks();

	}

}
