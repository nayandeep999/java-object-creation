package com.kodewala.object;

public class ObjectCounter {

	static int objectCreated = 0;

	{
		objectCreated++;
		System.out.println("Object created - " + objectCreated);
	}

	public static void main(String[] args) {

		ObjectCounter oc1 = new ObjectCounter();
		ObjectCounter oc2 = new ObjectCounter();
		ObjectCounter oc3 = new ObjectCounter();
		ObjectCounter oc4 = new ObjectCounter();
		ObjectCounter oc5 = new ObjectCounter();
		ObjectCounter oc6 = new ObjectCounter();
		ObjectCounter oc7 = new ObjectCounter();

	}

}
