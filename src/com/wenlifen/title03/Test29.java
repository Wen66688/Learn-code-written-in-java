package com.wenlifen.title03;

public class Test29 {
	public static void main(String[] args) {
		float f= 3.14f;
		new Test29().doIt(f);
		int u=23;
		Integer u1=u;
		int u2 = new Integer(23);
		System.out.println(u2==u);
		System.out.println(u2==u1);
		System.out.println(u1.equals(u));
		
		System.out.println(u1.equals(u));
		System.out.println(-12>>3);
	}
	void doIt(Float f) {
		System.out.println("float");
	}
	void doIt(double d) {
		System.out.println("double");
	}
}
