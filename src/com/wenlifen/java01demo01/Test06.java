package com.wenlifen.java01demo01;

import java.util.Scanner;

/*
 * date: 2022.12.6
 * if-else练习
 */
public class Test06 {
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		
		
		int num = (int)(Math.random()*90+10);
		int num1 = num/10;
		int num2 = num%10;
		System.out.print("输入1个两位数,猜一猜！");
		
		int n = s.nextInt();
		if(n>9&&n<100) {
			int n1 = n/10;
			int n2 = n%10;
			if(n==num) {
				System.out.println("10000");
			}else if((n1==num2)&&n2==num1) {
				System.out.println("3000");
			}else if (n1==num1||n2==num2) {
				System.out.println("1000");
			}else if(n1==num2||n2==num1) {
				System.out.println("500");
			}else {
				System.out.print("作废");
			}
		}else {
			System.out.println("请输入1个两位数！");
		}
		
		System.out.println(num);
		
	}
}
