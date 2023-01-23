package com.wenlifen.project03;

public class SmallDevelop {
	private int id;
	private String name;  //名字
	private String age;  //年龄
	private String salary;  // 工资
	private String position;  //职位
	private String prize;  //奖金
	private String stock;  // 股票
	
	public SmallDevelop() {}
		
	public SmallDevelop(int id,String name, String age, String salary, String position, String prize, String stock) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.position = position;
		this.prize = prize;
		this.stock = stock;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	
	

}
