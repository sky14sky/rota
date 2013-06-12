package com.headfirstjava.rota.Duck;

public class Duck {
	int size;

	int pounds = 6;
	float floatablility = 2.1F;
	String name = "Generic";
	long[] frathers = {1, 2, 3, 4, 5, 6, 7};
	boolean canFly = true;
	int maxSpeed = 25;

	public Duck(int duckSize) {
		System.out.println("Quack");

		size = duckSize;

		System.out.println("size is " + size);
	}

	public Duck() {
		System.out.println("type 1 duck");
	}

	public Duck(boolean fly) {
		System.out.println("type 2 duck");
	}

	public Duck(String n, long[] f) {
		System.out.println("type 3 duck");
	}

	public Duck(int w, float f) {
		pounds = 2;
		floatablility = f;
		System.out.println("type 4 duck");
	}

	public Duck(float denisity, int max) {
		floatablility = denisity;
		maxSpeed = max;
		System.out.println("type 5 duck");
	}
}
