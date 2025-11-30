package com.kodewala.keyconcepts;

class RetParent {
	Number getValue() {
		return 10;
	}
}

class RetChild extends RetParent {
	@Override
	Integer getValue() {
		return 20;
	} // Co-variant return type
}

public class MethodOverridingReturnType {
	public static void main(String[] args) {
		RetParent obj = new RetChild();
		System.out.println(obj.getValue()); // 20
	}
}
