package com.wenlifen.java02demo01;
/*
 * 综合案例2
 * 
 */
public class Test15 {
	public static void main(String[]args) {
		
	}
}
class AccountOne{
	private double balance;
	
	public AccountOne(double balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	/**
	 * 
	 * @param amount
	 * @return
	 * 取钱
	 */
	public double withdraw(double amount) {
		if(this.balance>amount) {
			System.out.println("可以取成功！余额还剩:"+(this.balance-amount));
			return this.balance-amount;
		}else {
			System.out.println("不好意思，你无法取的超过余额的钱！");
			return this.balance;
		}
	}
	/**
	 * 
	 * @param amount
	 * @return
	 * 存钱
	 */
	public double deposit(double amount) {
		System.out.println("您存入了：\t"+amount+"\t现在余额为:"+(this.balance+amount));
	return this.balance+amount;
	}
	
}

class CustomerOne {
	private String firstName;
	private String lastName;
	private AccountOne account;
	
	public CustomerOne(String f,String l) {
		this.firstName=f;
		this.lastName=l;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public String getLasetName() {
		return this.lastName;
	}
	public void setAccount(AccountOne account) {
		this.account=account;
	}
	public AccountOne getAccount() {
		return this.account;
	}
}
class Bank {
	private CustomerOne[] customers;
	private int numberOfCustomer;
	
	public Bank() {}
	
	public int getNumberofCustomers() {
		return this.numberOfCustomer;
	}
	public CustomerOne getCustomer(int index) {
		if(index>0&&index<this.numberOfCustomer) {
			return customers[index];
		}else {
			return null;
		}
		
	}
	public void addCustomer(String f,String l) {
		CustomerOne customers = new CustomerOne(f,l);
		this.customers[this.numberOfCustomer]=customers;
		numberOfCustomer++;
		
	}
	
	
}