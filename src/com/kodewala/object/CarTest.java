package com.kodewala.object;

class Engine {
	int power = 100;

	Engine() {
		System.out.println("Engine constructor");
		describe();
	}

	void describe() {
		System.out.println("Engine power = " + power);
	}
}

class TurboEngine extends Engine {
	int power = 300;

	TurboEngine() {
		System.out.println("TurboEngine constructor");
	}

	@Override
	void describe() {
		System.out.println("TurboEngine power = " + power);
	}
}

public class CarTest {
	public static void main(String[] args) {
		Engine e = new TurboEngine();
	}
}
