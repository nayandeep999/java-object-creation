package com.kodewala.keyconcepts;

class SuperEx {
	// SuperEx.show() declares that it throws a checked exception (Exception)
	// Any caller must handle or declare this exception
	void show() throws Exception {
		System.out.println("SuperEx");
	}
}

class SubEx extends SuperEx {
	@Override
	// Overriding rules for exceptions in Java:
	// ✅ Can throw no exception
	// ✅ Can throw the same exception as superclass
	// ✅ Can throw a subclass of the superclass exception
	// ❌ Cannot throw a broader exception than the superclass
	// Here, SubEx.show() throws nothing, which is allowed (narrower than Exception)
	void show() {
		System.out.println("SubEx");
	}
}

public class OverridingExceptionRule {
	public static void main(String[] args) throws Exception {
		// Polymorphism: reference type is SuperEx, object type is SubEx
		SuperEx s = new SubEx();

		// At runtime, SubEx.show() is executed
		// Even though SuperEx.show() declares 'throws Exception',
		// SubEx.show() does not throw anything, so no exception occurs
		s.show(); // Output: SubEx
	}
}

/*-
Key Concepts:
1. Overriding methods in Java can throw:
   - No exception
   - Same exception
   - Subclass of exception thrown by superclass method
2. Overriding method cannot throw a broader exception than superclass method.
3. Polymorphism ensures that the actual object's method (SubEx.show()) runs at runtime.
4. Even if reference type declares checked exception, actual method may not throw it.
-*/
