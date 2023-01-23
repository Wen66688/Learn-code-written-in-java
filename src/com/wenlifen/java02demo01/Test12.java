package com.wenlifen.java02demo01;

public class Test12 {
	public static void main(String[]args) {
		TriAngleTest test = new TriAngleTest(4,4);
		System.out.println(test.findArea(8, 8));
	}
}
class TriAngleTest{
	private double base;//边长
	private double height;//高
	TriAngleTest(){
		
	}
	TriAngleTest(double base,double height) {
	
		this.base=base;
		this.height=height;
		double area = base*height/2;
		System.out.println("面积为:"+area);
	}
	public void setBase(double base) {
		this.base=base;
	}
	public double getBase() {
		return this.base;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return this.height;
	}
	public double findArea(double base,double height) {
		
		this.base=base;
		this.height=height;
		double area = base*height/2;
		return area;
	}
	
}
