package com.wenlifen.project03;

import java.util.Scanner;

public class DevelopTest {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		boolean f = true;
		Company company = new Company();
		Team team = new Team(6);
		do {
			System.out.println("----------------------------开发团队调度软件----------------------");
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设配");
			company.companyPersonList();
			System.out.println("-----------------------------------------------------------------");
			System.out.print("1-团队列表\t2-添加团队成员\t3-删除团队成员\t4-退出\t请选择(1-4):");
			int num = s.nextInt();
			System.out.println();
			boolean result = true;
			if(num==1) {
				System.out.println("-------------------------团队成员列表----------------------");
				System.out.println();
				System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
				team.seeSmallPerson();
				System.out.println("------------------------------------------------------");	
			}
			if(num==2) {
				System.out.println("-------------------------添加团队成员列表----------------------");
				System.out.println();
				System.out.println("请输入要添加的员工ID:");
				int id = s.nextInt();
				BigDevelop dig = company.getBigDevelop()[id-1];
				String name = dig.getName();
				String age = dig.getAge();
				String salary = dig.getSalary();
				String position=dig.getPosition();
				String prize = dig.getPrize();
				String stock = dig.getStock();
				String state = dig.getState();
				String string = team.addSmallPerson(id,name,age,salary,position,prize,stock,state);
				System.out.println(string);
				if(string.equals("添加成功")) {
					
					dig.setState("BUSS");
				}
				System.out.println("------------------------------------------------------");	
			}
			if(num==3) {
				System.out.println("-------------------------删除团队成员列表----------------------");
				System.out.println();
				System.out.println("请输入要删除的员工TID:");
				int tid = s.nextInt();
				SmallDevelop small = team.getSmalldevelop()[tid-1];
				boolean r2 = team.deleteSmallPerson(tid);
				
				if(r2) {
					
					int id = small.getId();
					company.getBigDevelop()[id-1].setState("FREE");
					System.out.println("删除成功！");
				}else {
					System.out.println("删除失败！");
				}
				System.out.println("------------------------------------------------------");	
			}
			if(num==4) {
				while(result) {
					System.out.print("确认退出吗(N/Y):");
					String str = s.next();
					if(str.toUpperCase().equals("Y")) {
						f=false;
						result = false;
						System.out.println("---------------成功退出--------------");
					}else if (str.toUpperCase().equals("N")){
						result = false;
					}
				}
			}
		}while(f);
		
		
	}
}
