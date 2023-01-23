package com.wenlifen.java01demo01;
/*
 * author:wenlifen
 * date:2022.12.6
 * for循环练习
 */
public class Test09 {
	public static void main(String[]args) {
		for(int i=1;i<=150;i++) {
			System.out.print(i);
			if(i%3==0) {
				System.out.print(i+"foo");
			}
			if(i%5==0) {
				System.out.print(i+"biz");
			}
			if(i%7==0) {
				System.out.print(i+"baz");
			}
				System.out.println();
			
			
		}
	}
}
