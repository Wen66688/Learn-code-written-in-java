package com.wenlifen.java02demo01;

public class Test02 {
	public static void main(String[]args) {
		Person person1 = new Person();
		person1.name="Tom";
		person1.age=20;
		person1.sex=1;
		person1.study();
		person1.showAge();
		System.out.println("新增年龄后:"+person1.addAge(2));
		Person person2 = new Person();
		person2.name="Jone";
		person2.age=30;
		person2.sex=0;
		person2.study();
		person2.showAge();
		System.out.println("新增年龄会:"+person2.addAge(2));
	}

}

class Person {
	String name;
	int age;
	int sex;
	public void study() {
		System.out.println("stydying");
	}
	public void showAge() {
		System.out.println("age:"+age);
	}
	public int addAge(int i) {
		int sum = i + age;
		return sum;
	}
}