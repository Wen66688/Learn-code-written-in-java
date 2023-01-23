package com.wenlifen.java02demo09;

public class LhsTest {
	public static void main(String[] args) {
		TestThree.output(1);
		
	}
}
//饿汉式
class TestOne{
	private static TestOne one = new TestOne();
	
	private TestOne() {}
	
	public static TestOne getOne() {
		return one;
	}
	
}

//懒汉式
class TestTwo{
	private static TestTwo two = null;
	private TestTwo() {}
	public static TestTwo getTwo() {
		if(two==null) {
			return new TestTwo();
		}
		return two;
	}
}

//代码块测试
class TestThree{
	public TestThree(){
		System.out.println("1");
	}
	static{
		System.out.println("2");
	}
	public static void output(final int i) {
		System.out.println("3");
		System.out.println(i);
		
	}
}

