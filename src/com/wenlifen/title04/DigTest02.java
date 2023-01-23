package com.wenlifen.title04;

public class DigTest02 {
	public static void main(String[] args) {
		DigTest02 dig = new DigTest02();
		long b[] = {100,200,300,400};
		int length = dig.computeLength(b);
		System.out.println("b的长度:"+length);
	}
	
	public int computeLength(long[] b) {
		return b.length;
	}
}
