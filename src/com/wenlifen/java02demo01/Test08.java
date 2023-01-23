package com.wenlifen.java02demo01;
/*
 * 把a变100，b变200
 */
public class Test08 {
	public static void main(String[]args) {
		int a= 10;
		int b = 10;
		method(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void method(int a, int b) {
		a=a*10;
		System.out.println("method中的a:"+a);
	}
}
