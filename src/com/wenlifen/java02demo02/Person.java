package com.wenlifen.java02demo02;

public class Person {
	String name;
	char sex;
	int age;
	public Person(String name,char sex,int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String toString() {
		String str = "name="+name+"\tsex="+sex+"\tage="+age;
		return str;
	}
}
