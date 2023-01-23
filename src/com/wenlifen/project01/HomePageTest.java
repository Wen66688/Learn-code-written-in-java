package com.wenlifen.project01;

import java.util.Scanner;

public class HomePageTest {
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		DetailPage detail = new DetailPage(10000);
		
		String [] string=new String[5];
		
		
		
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
				detail.moneyOut(string);
				System.out.println();
				System.out.println();
				System.out.println();
			}
			if(num==2) {
				System.out.print("收入金额:");
				double incomeMoney = s.nextDouble();
				System.out.println();
				System.out.print("收入说明:");
				String incomeState = s.next();
				IncomePage income = new IncomePage(incomeMoney,incomeState);
				detail.moneyIncome(incomeMoney, incomeState);
				string[i]="收入\t"+detail.getNum()+"\t"+incomeMoney+"\t"+incomeState;
				i++;
			}
			
			if(num==3) {
				System.out.print("支出金额:");
				double expendMoney = s.nextDouble();
				System.out.println();
				System.out.print("支出说明:");
				String expendState = s.next();
				ExpendPage expend = new ExpendPage(expendMoney,expendState);
				detail.moneyExpend(expendMoney, expendState);
				if(detail.getNum()-expendMoney>=0) {
					string[i]="支出\t"+detail.getNum()+"\t"+expendMoney+"\t"+expendState;
					i++;
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
