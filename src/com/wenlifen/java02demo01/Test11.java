package com.wenlifen.java02demo01;

public class Test11 {
	public static void main(String[]args) {
		PersonTest test = new PersonTest();
		test.setAge(10);
		System.out.println(test.getAge());
		test.setName("wenlifen");
		System.out.println(test.getName());
	}
}
class PersonTest {
	private int age;
	private String name;
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String i) {
		this.name=i;
	}
	public String getName() {
		return this.name;
	}
	
}
