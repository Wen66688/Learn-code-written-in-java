package com.wenlifen.java02demo04;

public class InstanceTest {
	public static void main(String[] args) {
		InstanceTest test = new InstanceTest();
		PersonTwo g = new Graduate();
		g.getInfo();
		test.method(g);
	}

	public void method(PersonTwo e) {
		if(e instanceof Graduate) {
			e.getInfo();
			System.out.println("a graduated student");
			System.out.println("a student");
			System.out.println("a person");
		}else if(e instanceof Student) {
			e.getInfo();
			System.out.println("a student");
			System.out.println("a person");
		}else if(e instanceof PersonTwo) {
			e.getInfo();
			
			System.out.println("a person");
		}
	}
	
}

class PersonTwo {
	protected String name = "person";
	protected int age = 50;
	public String getInfo() {
		return "Name:"+name+"\n"+"age:"+age;
	}
}

class Student extends PersonTwo {
	protected String school = "PKU";
	public String getInfo() {
		return "Name:"+name+"\n"+"age:"+age+"\n"+"school"+school;
	}
}
class Graduate extends Student {
	protected String major = "IT";
	
	public String getInfo() {
		return "Name:"+name+"\n"+"age:"+age+"\n"+"school:"+school+"\n"+"major:"+major;
	}
}