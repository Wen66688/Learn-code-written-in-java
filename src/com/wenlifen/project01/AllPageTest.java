package com.wenlifen.project01;

import java.util.Scanner;

/*
 * java基础写
 */
public class AllPageTest {
public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		
		
//		String [] string=new String[5];
		String string="";
		
		double moneyAll = 10000;
		
		boolean f = true;
		int i = 0;
		do {
			System.out.println("***************家庭收入支出记账软件************");
			System.out.println("1.收入明细");
			System.out.println("2.登记收入");
			System.out.println("3.登记支出");
			System.out.println("4.退\t出");
			System.out.println();
			System.out.print("请选择(1-4):_");
			int num = s.nextInt();
			System.out.println();
			boolean result = true;
			if(num==1) {
				System.out.println("******************当前收支明细记录**********");
				System.out.println("收支\t账户金额\t收支金额\t说明");
//				for(int j=0;j<string.length;j++) {
//					if(string[j]!=null) {
//						System.out.println(string[j]);
//					}
//				}
				System.out.println(string);
				System.out.println();
				System.out.println();
			}
			if(num==2) {
				System.out.print("收入金额:");
				double incomeMoney = s.nextDouble();
				System.out.println();
				System.out.print("收入说明:");
				String incomeState = s.next();
				
				moneyAll+=incomeMoney;
//				string[i]="收入\t"+moneyAll+"\t"+incomeMoney+"\t"+incomeState;
				string+="收入\t"+moneyAll+"\t"+incomeMoney+"\t"+incomeState+"\n";
				i++;
			}
			
			if(num==3) {
				System.out.print("支出金额:");
				double expendMoney = s.nextDouble();
				System.out.println();
				System.out.print("支出说明:");
				String expendState = s.next();
				
				if(moneyAll>=expendMoney) {
					moneyAll-=expendMoney;
//					string[i]="支出\t"+moneyAll+"\t"+expendMoney+"\t"+expendState;
					string+="支出\t"+moneyAll+"\t"+expendMoney+"\t"+expendState+"\n";
					i++;
				}else {
					System.out.println("对不起你没有这么多钱！");
				}
			}
			
			if(num==4) {
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
			}
			
			
		}while(f);
		
	}
}
