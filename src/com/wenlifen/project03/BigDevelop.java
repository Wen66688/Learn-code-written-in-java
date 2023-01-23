package com.wenlifen.project03;

public class BigDevelop {
	private String name;  //名字
	private String age;  //年龄
	private String salary;  // 工资
	private String position;  //职位
	private String state;  //状态
	private String prize;  //奖金
	private String stock;  // 股票
	private String setUp;  // 领用设配
	
	public BigDevelop() {}
	
	
	public BigDevelop(String name, String age, String salary, String position, String state, String prize, String stock,
			String setUp) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.position = position;
		this.state = state;
		this.prize = prize;
		this.stock = stock;
		this.setUp = setUp;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	public String getSetUp() {
		return setUp;
	}
	public void setSetUp(String setUp) {
		this.setUp = setUp;
	}
	
	

}
