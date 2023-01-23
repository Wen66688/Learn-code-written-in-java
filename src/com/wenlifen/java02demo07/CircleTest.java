package com.wenlifen.java02demo07;

public class CircleTest {
	public static void main(String []args) {
		Circle circleOne = new Circle(4);
		Circle circleTwo = new Circle(4);
		System.out.println(circleOne.equals(circleTwo));
		System.out.println(circleOne.toString());
		System.out.println(circleTwo.toString());
		System.out.println(circleOne.color.equals(circleTwo.color));
	}
}
