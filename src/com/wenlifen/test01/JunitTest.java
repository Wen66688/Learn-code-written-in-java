package com.wenlifen.test01;

import org.junit.Test;

public class JunitTest {
	public static void main(String[] args) {
		Integer d = 10;
		int e = d;
		int f = d.intValue();
		
		String num="123";
		System.out.println(num=="123");
		int num1= Integer.parseInt(num);
		System.out.println(num1);
		String num2 = String.valueOf(num1);
		System.out.println(num2=="123");
	}
	@Test
	public void testOne() {
		int a=10;
		Integer b = new Integer(a);
		System.out.println(b.toString()=="10");
		Integer c = Integer.valueOf(a);
		System.out.println(c.toString()=="10");
		
	}
	
}
