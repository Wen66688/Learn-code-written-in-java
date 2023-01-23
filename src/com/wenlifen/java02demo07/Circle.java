package com.wenlifen.java02demo07;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
		super("white",1.0);
		this.radius=1.0;
	}
	public Circle(double radius) {
		super("white",1.0);
		this.radius = radius;
	}
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
		return Math.PI*this.radius*this.radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
