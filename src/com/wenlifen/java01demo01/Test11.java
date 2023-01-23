package com.wenlifen.java01demo01;
/*
 * author:wenlifen
 * date:2022.12.6
 * for循环练习
 */
public class Test11 {
	public static void main(String[]args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println("奇数:"+i);
				sum+=i;
			}
		}
		System.out.println("奇数和为:"+sum);
	}
}
