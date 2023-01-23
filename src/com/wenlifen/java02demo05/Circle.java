package com.wenlifen.java02demo05;

public class Circle extends GeometricObject1{
	private double radius;
	public Circle(double radius,String color,double weight) {
		super(color,weight);
		this.radius=radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public double findArea() {
		return Math.PI*radius*radius;
	}
}
