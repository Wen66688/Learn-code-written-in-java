package com.wenlifen.java01demo01;

import java.util.Scanner;

/*
 * date: 2022.12.6
 * if-else练习
 */

public class Test02 {
	public static void main(String[]args) {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("输入三个数比大小！");
		System.out.println("num1:");
		int num1 = num.nextInt();
		System.out.println("num2:");
		int num2 = num.nextInt();
		System.out.println("num3:");
		int num3 = num.nextInt();
		
		
		if(num1>num2&&num1>num3) {
			if(num2>num3) {
				System.out.print("num1:"+num1);
				System.out.print("num2:"+num2);
				System.out.print("num3:"+num3);
			}else {
				System.out.print("num1:"+num1);
				System.out.print("num3:"+num3);
				System.out.print("num2:"+num2);
			}
		}else if(num1>num2&&num1<num3) {
			System.out.print("num2:"+num2);
			System.out.print("num1:"+num1);
			System.out.print("num3:"+num3);
		}else {
			if(num2>num3) {
				
				System.out.print("num2:"+num2);
				System.out.print("num3:"+num3);
				System.out.print("num1:"+num1);
			}else {
				
				System.out.print("num3:"+num3);
				System.out.print("num2:"+num2);
				System.out.print("num1:"+num1);
			}
		}
		
		
	}
}
