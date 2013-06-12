package com.headfirstjava.rota.Testbox;

public class TestBox {
	/**
	 * Integer로 하면 값을 설정해 줘야 합니다.
	 *  
	 * */

	Integer i = 7;
	int j;

	public static void main(String[] args) {
		TestBox t = new TestBox();
		t.go();
	}

	public void go() {
		j = i;
		System.out.println(j);
		System.out.println(i);
	}

}
