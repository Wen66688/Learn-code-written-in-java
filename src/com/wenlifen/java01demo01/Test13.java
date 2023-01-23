package com.wenlifen.java01demo01;
/*
 * author:wenlifen
 * date:2022.12.6
 * for循环练习
 */
public class Test13 {
	public static void main(String[]args) {
		for(int i=100;i<1000;i++) {
			int num1 = i/100;
			int num2 = i%100/10;
			int num3 = i%100%10;
			if(i==num1*num1*num1+num2*num2*num2+num3*num3*num3) {
				
				System.out.println(i+"Yes,为水仙花！");
			}
		}
	}
}
