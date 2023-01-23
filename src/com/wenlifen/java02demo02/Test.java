package com.wenlifen.java02demo02;

public class Test {
	public static void main(String []args) {
		Person person = new Person("Tom",'男',21);
		System.out.println(person.toString());
		Student Tom = new Student("Tom",'男',21,11111111,89,78,88);
		System.out.println(Tom.toString());
		Tom.age=2;
		System.out.println(Tom.toString());
	}
}
