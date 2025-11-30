package com.kodewala.keyconcepts;

class ShadowA {
	static int x = 10;
}

class ShadowB extends ShadowA {
	static int x = 20;
}

public class ShadowingStaticVariables {
	public static void main(String[] args) {
		ShadowA a = new ShadowB();
		System.out.println(a.x); // 10 (static variables are hidden, not overridden)
		// Fields belong to the reference type
	}
}
