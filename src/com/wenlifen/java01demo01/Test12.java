package com.wenlifen.java01demo01;
/*
 * author:wenlifen
 * date:2022.12.6
 * for循环练习
 */
public class Test12 {
	public static void main(String[]args) {
		int sum=0;
		int count=0;
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				System.out.println("为7的倍数:"+i);
				count++;
				sum+=i;
			}
		}
		System.out.println("为7倍数的个数:"+count+"为7倍数的和:"+sum);
	}
}
