package com.wenlifen.java02demo01;

public class Test07 {
	public static void main(String[]args) {
		OverLoadTestOne one = new OverLoadTestOne();
		one.mOL(20);
		one.mOL(20,10);
		one.mOL("overload");
		OverLoadTestTwo two = new OverLoadTestTwo();
		System.out.println("最大值:"+two.max(34, 56));
		System.out.println("最大值:"+two.max(34.2, 46));
		System.out.println("最大值:"+two.max(34.2, 86,59));
		
		
	}

}
class OverLoadTestOne {
	public void mOL(int num) {
		int sum = num * num;
		System.out.println("平方:"+sum);
	}
	public void mOL(int num1,int num2) {
		int sum = num1 * num2;
		System.out.println("乘积:"+sum);
	}
	public void mOL(String s) {
		System.out.println("字符串:"+s);
	}
}

class OverLoadTestTwo{
	public int max(int num1,int num2) {
		int num = num1>num2?num1:num2;
		return num;
	}
	public double max(double num1,double num2) {
		double num = num1>num2?num1:num2;
		return num;
	}
	public double max(double num1,double num2,double num3) {
		double num = (num1>num2?num1:num2)>num3?(num1>num2?num1:num2):num3;
		return num;
	}
}
