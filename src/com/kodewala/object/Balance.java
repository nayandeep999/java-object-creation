package com.kodewala.object;

public class Balance {
	
	int balance;
	String accNum;
	String name;
	


	public Balance (int _balance, String _accNum, String _name){
		
		this.balance = _balance;
		this.accNum = _accNum;
		this.name = _name;
		
	}
	
	public Balance() {
		//default cons without params
		/** Constructor
		 - creating new obj(using new kwyword)
		 - Allocating memory
		 - Initializing the variable / attributes
		 * 
		 * 
		 * **/
	}

	public static void main(String[] args) {
		
		Balance bal = new Balance();
		
		Balance bal2 = new Balance(1000,"220220", "A");
		

	}

}
