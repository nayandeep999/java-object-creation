package com.kodewala.object;

public class Payment {
	
	int amount;
	String name;
	int accNuumber;
	
	Payment(int _amount,String _name){ //constructor helps us initialize the state of the object
		
		this.amount = _amount;
		this.name = _name;
		
	}
	
	Payment(int _amount,String _name, int _accNumber){ //constructor helps us initialize the state of the object
		
		this.amount = _amount;
		this.name = _name;
		
	}
	
	private void getAmount() {
		System.out.println(this.name + "- Added amount: " + this.amount);

	}

	public static void main(String[] args) {
		
		Payment nayandeep = new Payment(10000, "Nayandeep");
		nayandeep.getAmount();
		
		Payment krishna = new Payment(2000, "Krishna");
		krishna.getAmount();

	}

}
