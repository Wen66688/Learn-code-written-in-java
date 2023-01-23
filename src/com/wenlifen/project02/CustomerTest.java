package com.wenlifen.project02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomerTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CustomerMessage [] customer=new CustomerMessage[5];
		CustomerList customers = new CustomerList();
		boolean f = true;
		int i=0;
		do {
			System.out.println("***************客户信息管理软件************");
			System.out.println("1.添加客户");
			System.out.println("2.修改客户");
			System.out.println("3.删除客户");
			System.out.println("4.客户列表");
			System.out.println("5.退\t出");
			System.out.println();
			System.out.print("请选择(1-5):_");
			int num = s.nextInt();
			System.out.println();
			boolean result = true;
			
			if(num==1) {
				System.out.println("--------添加客户------");
				if(i<customer.length) {
					customer[i]=new CustomerMessage();
					System.out.print("名字:");
					String name=s.next();
					System.out.println();
					System.out.print("性别:");
					String sex = s.next();
					System.out.println();
					System.out.print("年龄:");
					int age = s.nextInt();
					System.out.println();
					System.out.print("电话:");
					int phone = s.nextInt();
					System.out.println();
					System.out.print("邮箱:");
					String email = s.next();
					System.out.println();
					customer[i].addCustomer(name, sex, age, phone, email);
					i++;
				}else {
					System.out.println("不好意思客户已经满了，无法再添加！");
				}
				System.out.println("--------添加完成------");
			}else if(num==2) {
				System.out.println("-----------修改客户----------");
				System.out.print("请选择待修改客户编号(-1退出):");
				int number1 = s.nextInt();
				
				System.out.println();
				if(number1==-1) {
					f=false;
					System.out.println("---------退出完成-----------");
				}else if(number1>=0&&number1<customer.length) {
					int number = number1-1;
					System.out.print("名字("+customer[number].getName()+"):");
					String name=s.next();
					System.out.println();
					System.out.print("性别("+customer[number].getSex()+"):");
					String sex = s.next();
					System.out.println();
					System.out.print("年龄("+customer[number].getAge()+"):");
					int age = s.nextInt();
					System.out.println();
					System.out.print("电话("+customer[number].getPhone()+"):");
					int phone = s.nextInt();
					System.out.println();
					System.out.print("邮箱("+customer[number].getEmail()+"):");
					String email = s.next();
					System.out.println();
					if(name=="") {
						name=customer[number].getName();
					}
					if(sex=="") {
						sex=customer[number].getSex();
					}
					String age1=String.valueOf(age);
					if(age1=="") {
						age=customer[number].getAge();
					}
					String phone1=String.valueOf(phone);
					if(phone1=="") {
						phone=customer[number].getPhone();
					}
					if(email=="") {
						email=customer[number].getEmail();
					}
					customer[number].changeCustomer(name, sex, age, phone, email);
				System.out.println("----------修改完成---------");
				}else {
					System.out.println("对不起没有此编号！");
				}
			}else if(num==3) {
				System.out.println("-----------删除客户---------");
				System.out.print("请选择待修改客户编号(-1退出):");
				int deleteNumber = s.nextInt();
				System.out.println();
				if(deleteNumber==-1) {
					f=false;
					System.out.println("---------退出完成-----------");
				}else if(deleteNumber>=0&&deleteNumber<customer.length) {
					System.out.print("确认是否删除(Y/N):");
					String yn = s.next();
					if(yn.trim().equals("Y")) {
						customers.deleteCustomer(customer, deleteNumber);
					}
					
				}else {
					System.out.println("没有此编号！");
				}
				
				
			}else if(num==4) {
				System.out.println("-------客户列表------");
				customers.listCustomer(customer);
				System.out.println("----------客户列表完成---------");
				
			}else if(num==5) {
				while(result) {
					System.out.print("确认退出吗(N/Y):");
					String str = s.next();
					if(str.equals("Y")) {
						f=false;
						result = false;
					}else if (str.equals("N")){
						result = false;
					}
				}
				System.out.println("---------退出完成-----------");
			}else {
				System.out.println("请在编号中选择！");
			}
			
			
		}while(f);
		
		
		
		
	}
}
