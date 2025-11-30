package com.kodewala.keyconcepts;

class ConsBase {
	ConsBase() {
		show(); // calls overridden method! // method calls are always resolved at runtime based
				// on the actual object's type, not the reference type.
		// dynamic method dispatch (or RUNTIME POLYMERPHISM)
	}

	void show() {
		System.out.println("Base show");
	}
}

class ConsDerived extends ConsBase {
	int x = 10;

	@Override
	void show() {
		System.out.println("Derived show, x = " + x);
	}
}

public class DynamicMethodDispatch {
	public static void main(String[] args) {
		new ConsDerived();
	}
}
