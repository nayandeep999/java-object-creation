package com.kodewala.keyconcepts;

class Ambiguous {

	// Method 1: first param int, second param float
	void show(int a, float b) {
		System.out.println("int-float");
	}

	// Method 2: first param float, second param int
	void show(float a, int b) {
		System.out.println("float-int");
	}
}

public class AmbiguityOverloading {

	public static void main(String[] args) {

		Ambiguous obj = new Ambiguous();

		// This call creates ambiguity:
		// obj.show(10, 10);

		/*- 
		   EXPLANATION:
		
		   Both arguments '10' and '10' are int literals.
		
		   Java checks which overloaded method fits better:
		
		   -------------------------------------------------------
		   Method 1: show(int, float)
		     - First argument: 10  → matches int exactly ✔
		     - Second argument: 10 → needs widening to float ✔ widening - converting a smaller data type into a larger data type automatically by the compiler.
		
		   Method 2: show(float, int)
		     - First argument: 10  → needs widening to float ✔
		     - Second argument: 10 → matches int exactly ✔
		   -------------------------------------------------------
		
		   RESULT:
		   - In both methods, one parameter matches EXACTLY
		     and the other needs WIDENING conversion.
		   - Neither method is a "better" match.
		   - So Java cannot choose.
		   
		   Therefore → COMPILATION ERROR: Ambiguous method call
		*/

//        obj.show(10, 10); ❌ ERROR: Ambiguous
	}
}
