package com.wenlifen.java01demo01;

import java.util.Scanner;

/*
 * author:wenlifen
 * date:2022.12.6
 * for循环练习
 */
public class Test10 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("输入两位数看看他们的最大公约数和最小公倍数！");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		boolean isTrue=true;
		int i=1;
		while(isTrue) {
			if(i%num1==0&&i%num2==0) {
				isTrue=false;
				System.out.print("最小公倍数为:"+i);
			}
			i++;
		}
		for(int i1=20;i1>=1;i1--) {
			if(num1%i1==0&&num2%i1==0) {
				System.out.println("最大公约数为:"+i1);
				break;
			}
		}
	}

}
