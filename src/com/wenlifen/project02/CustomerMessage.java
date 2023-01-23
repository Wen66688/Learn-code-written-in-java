package com.wenlifen.project02;

public class CustomerMessage {
	private String name;
	private String sex;
	private int age;
	private int phone;
	private String email;
	
	public CustomerMessage() {}
	
	public CustomerMessage(String name, String sex, int age, int phone, String email) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
//	添加客户
	public void addCustomer(String name, String sex, int age, int phone, String email) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
//	修改客户
	public void changeCustomer(String name, String sex, int age, int phone, String email) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

}
