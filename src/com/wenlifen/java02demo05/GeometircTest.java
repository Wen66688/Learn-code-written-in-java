package com.wenlifen.java02demo05;

public class GeometircTest {
	public static void main(String[] args) {
		GeometircTest test = new GeometircTest();
		
		GeometricObject1 g = new Circle(4,"red",4.2);
		System.out.println(test.displayGeometricObject(g));
		GeometricObject1 g1 = new Circle(2,"red",4.2);
		GeometricObject1 g2 =  new MyRectangele(4,2,"blue",4.2);
		boolean t=test.equalsArea(g1, g2);
		System.out.println(t);

		
	}
	
	public boolean equalsArea(GeometricObject1 g1,GeometricObject1 g2) {
		if(g1.findArea()==g2.findArea()) {
			return true;
		}else {
			return false;
		}
	}
	public double displayGeometricObject(GeometricObject1 g) {
		return g.findArea();
	}

}
