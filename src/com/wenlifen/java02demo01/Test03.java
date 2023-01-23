package com.wenlifen.java02demo01;

public class Test03 {
	public static void main(String[]args) {
		Circle circle = new Circle();
		System.out.println("面积:"+circle.area(4));
	}
}
class Circle{
	
	public double area(double redius) {
		double s=Math.PI*redius*redius;
		return s;
	}
	
}
