package com.headfirstjava.rota.Math;

import org.junit.Test;

public class MathTest {

	@Test
	public void mathRandom() {
		double x1 = Math.random();
		int y1 = (int)(Math.random() * 5);
		System.out.println("y1 : " + x1);
		System.out.println("y1 : " + y1);
	}

	@Test
	public void mathAbs() {
		int x2 = Math.abs(-240);
		double y2 = Math.abs(240.45);
		System.out.println("x2 : " + x2);
		System.out.println("y2 : " + y2);
	}

	@Test
	public void mathRound() {
		int x3 = Math.round(-24.8f);
		int y3 = Math.round(24.45f);
		System.out.println("x3 : " + x3);
		System.out.println("y3 : " + y3);
	}

	@Test
	public void mathMin() {
		int x4 = Math.min(24, 240);
		double y4 = Math.min(24.45, 240.45);
		System.out.println("x4 : " + x4);
		System.out.println("y4 : " + y4);
	}

	@Test
	public void mathMax() {
		int x5 = Math.max(24, 240);
		double y5 = Math.max(24.45, 240.45);
		System.out.println("x5 : " + x5);
		System.out.println("y5 : " + y5);
	}

}
