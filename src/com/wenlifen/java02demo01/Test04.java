package com.wenlifen.java02demo01;

public class Test04 {
	public static void main(String[]args) {
		Test04 test = new Test04();
		
		System.out.println(test.findRectangle(10,8));
	}
	public double findRectangle(int row, int list) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=list;j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
		double area = row * list;
		return area;
	}
}

