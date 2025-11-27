package com.kodewala.object;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		acc.sysout();
		
		System.out.println(Account.balance); 

	}

}

class Account {

	int amount = 10000;
	
	static int  balance = 100;

	 void sysout() {
		System.out.println("The amount is: " + amount);

	}

}
