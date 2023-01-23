package com.wenlifen.java02demo01;

public class Test09 {
	public static void main(String[]args) {
		CircleOne[] circle = new CircleOne[5];
		PassObject pass = new PassObject();
		pass.printAreas(circle, 5);
		
	}

}
class CircleOne{
//	double radius;
	public double findArea(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}
}
class PassObject {
	public void printAreas(CircleOne[] c,int time) {
		for(int i=0;i<time;i++) {
			System.out.println("半径:"+(i+1));
			c[i] = new CircleOne();
			System.out.println("面积:"+c[i].findArea((i+1)));
		}
	}
}
