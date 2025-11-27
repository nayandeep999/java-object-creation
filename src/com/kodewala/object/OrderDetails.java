package com.kodewala.object;

public class OrderDetails {

	int orderId;
	String itemName;
	int price;
	int qty;
	int gst;

	OrderDetails(int _orderId, String _itemName, int _price, int _qty, int _gst) {

		this.orderId = _orderId;
		this.itemName = _itemName;
		this.price = _price;
		this.qty = _qty;
		this.gst = _gst;

	}

	OrderDetails(int _orderId, String _itemName, int _price, int _qty) {

		this.orderId = _orderId;
		this.itemName = _itemName;
		this.price = _price;
		this.qty = _qty;

	}

	public void getCustomerDetailsWithGst() {
		System.out.println(orderId + " " + itemName + " " + price + " " + qty + " " + gst);
	}

	public void getCustomerDetailsWithoutGst() {

		System.out.println(orderId + " " + itemName + " " + price + " " + qty + " ");
	}

	public static void main(String[] args) {

		OrderDetails o1 = new OrderDetails(101, "Laptop", 50000, 1, 18);
		o1.getCustomerDetailsWithGst();

		OrderDetails o2 = new OrderDetails(102, "Mouse", 800, 2, 5);
		o2.getCustomerDetailsWithGst();

		OrderDetails o3 = new OrderDetails(103, "Keyboard", 1500, 1, 12);
		o3.getCustomerDetailsWithGst();

		OrderDetails o4 = new OrderDetails(104, "Monitor", 9000, 1);
		o4.getCustomerDetailsWithoutGst();

		OrderDetails o5 = new OrderDetails(105, "USB-Cable", 300, 3);
		o5.getCustomerDetailsWithoutGst();

	}

}
