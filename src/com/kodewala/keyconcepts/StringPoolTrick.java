package com.kodewala.keyconcepts;

public class StringPoolTrick {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "he" + "llo";

		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // true
	}
}
