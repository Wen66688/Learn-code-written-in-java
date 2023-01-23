package com.wenlifen.java02demo01;
/*
 * this综合案例1
 * 
 */
public class Test14 {
	public static void main(String[]args) {
		Customer customer = new Customer("Jane","Smith");
		Account account = new Account(1000,2000,1.23);
		System.out.println(customer.getFirstName()+customer.getLasetName());
		customer.setAccount(account);
		customer.getAccount().deposit(100);
		customer.getAccount().withdraw(960);
		customer.getAccount().withdraw(2000);	 
	}
}
class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	
	
	
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double withdraw(double amount) {
		if(this.balance>amount) {
			System.out.println("可以取成功！余额还剩:"+(this.balance-amount));
			return this.balance-amount;
		}else {
			System.out.println("不好意思，你无法取的超过余额的钱！");
			return this.balance;
		}
	}
	
	public double deposit(double amount) {
		System.out.println("您存入了：\t"+amount+"\t现在余额为:"+(this.balance+amount));
	return this.balance+amount;
	}
	
}

class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String f,String l) {
		this.firstName=f;
		this.lastName=l;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLasetName() {
		return this.lastName;
	}
	public void setAccount(Account account) {
		this.account=account;
	}
	public Account getAccount() {
		return this.account;
	}
}
