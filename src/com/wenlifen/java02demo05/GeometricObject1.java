package com.wenlifen.java02demo05;

public class GeometricObject1 {
	private String color;
	private double weight;
	protected GeometricObject1(String color,double weight) {
		this.color=color;
		this.weight = weight;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double findArea() {
		return 0.0;
	}
}

