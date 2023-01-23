package com.wenlifen.java02demo01;
/*
 * this与构造器的练习
 */
public class Test13 {
	public static void main(String[]args) {
		Boy boy = new Boy("Tom",33);
		Girl girlone = new Girl("Jone",25);
		Girl girltwo = new Girl("Ben",25);
		
		System.out.println("我要和"+boy.marry(girlone));
		boy.shout();
		System.out.println(girlone.marry(boy));
		System.out.println(girlone.compare(girltwo));
		
		
	}
}
class Boy{
	private String name;
	private int age;
	
	public Boy() {}
	public Boy(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String marry(Girl girl) {
		return girl.getName();
	}
	public void shout() {
		System.out.println("我很帅!");
	}
}
class Girl {
	private String name;
	private int age;
	
	public Girl() {}
	public Girl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String marry(Boy boy) {
		return boy.getName();
	}
	public String compare(Girl girl) {
		return girl.getName();
	}
}
