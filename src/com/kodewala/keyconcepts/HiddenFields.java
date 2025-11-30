package com.kodewala.keyconcepts;

class HideParent {
	int x = 10;
}

class HideChild extends HideParent {
	int x = 20;
}

public class HiddenFields {
	public static void main(String[] args) {
		HideParent obj = new HideChild();
		System.out.println(obj.x); // 10
	}
}
