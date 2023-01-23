package com.wenlifen.java02demo01;

public class Test10 {
	public static void main(String[]args) {
		RecursionTest test = new RecursionTest();
		System.out.println(test.nl(8));
		System.out.println(test.sl(10));
		System.out.println(test.zl(10));
		System.out.println(test.sc(7));
	}
}
class RecursionTest{
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int nl(int num) {
		this.num=num;
		if(this.num<0) {
			System.out.println("抱歉不可以为负数！");
			return 0;
		}else if(this.num==1) {
			return 1;
		}else {
			return num * nl(this.num-1);
		}
	}
	public int sl(int num) {
		if(num==0) {
			return 1;
		}else if(num==1) {
			return 4;
		}else {
			return sl(num-2)+(2*sl(num-1));
		}
	}
	public int zl(int num) {
		if(num==20) {
			return 1;
		}else if(num==21) {
			return 4;
		}else {
			return sl(num+2)-(2*sl(num+1));
		}
	}
	public int sc(int num) {
		if(num==1||num==2) {
			return 1;
		}else {
			return sc(num-2)+sc(num-1);
		}
	}
	
}
