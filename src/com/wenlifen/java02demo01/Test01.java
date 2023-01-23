package com.wenlifen.java02demo01;
/*
 * 
 * date:2022.12.18
 * content:面向对象
 * 
 */
public class Test01 {
	public static void main(String[]args) {
		Student student1 = new Student();
		student1.name="Tom";
		student1.age=12;
		student1.major="202020";
		student1.interests="改bug";
		System.out.println(student1.say());
		Teacher teacher1 = new Teacher();
		teacher1.name="Jone";
		teacher1.age = 26;
		teacher1.teachAge=3;
		teacher1.course="英语";
		teacher1.say();
	}

}

class Student{
	String name;
	int age;
	String major;
	String interests;
	
	public String say() {
		return "name："+name+"age:"+age+"major:"+major+"interests:"+interests;
	}
}

class Teacher{
	String name;
	int age;
	int teachAge;
	String course;
	
	public void say() {
		System.out.println("name:"+name+"age:"+age+"teachAge:"+teachAge+"course:"+course);
	}
}
