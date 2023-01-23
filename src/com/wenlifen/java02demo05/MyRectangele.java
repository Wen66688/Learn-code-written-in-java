package com.wenlifen.java02demo05;

public class MyRectangele extends GeometricObject1{
	private double width;
	private double height;
	public MyRectangele(double width,double height,String color,double weight) {
		super(color,weight);
		this.width=width;
		this.height=height;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getWidth(){
		return this.width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return this.height;
	}
	public double findArea() {
		return this.height*this.width;
	}
}
