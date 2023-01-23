package com.wenlifen.project02;

public class CustomerList {
	private CustomerMessage[] customer;
	private int i;
	public CustomerMessage[] getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerMessage[] customer) {
		this.customer = customer;
	}
	
//  客户列表
	public void listCustomer(CustomerMessage[] c) {
		this.customer = c;
		System.out.println("编号\t"+"姓名\t"+"性别\t"+"年龄\t"+"电话\t"+"邮件");
		for(i=0;i<this.customer.length;i++) {
			if(customer[i]!=null) {
				String name = customer[i].getName();
				String sex = customer[i].getSex();
				int age = customer[i].getAge();
				int phone = customer[i].getPhone();
				String email = customer[i].getEmail();
				System.out.println((i+1)+"\t"+name+"\t"+sex+"\t"+age+"\t"+phone+"\t"+email);
			
			}
		}
	}
//	删除客户
	public void deleteCustomer(CustomerMessage[] c,int num) {
		this.customer = c;
		int number = num -1;
		
			for(i=number;i<this.customer.length;i++) {
				if(i<this.customer.length-1) {
					customer[i]=customer[i+1];
				}else if (i==this.customer.length-1) {
					customer[i]=null;
				}
			}
		
	}
	
}


