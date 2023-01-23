package com.wenlifen.java01demo01;
/*
 * author:wenlifen
 * date:2022.12.6
 * 99乘法表
 */
public class Test14 {
	public static void main(String[]args) {
		for(int i=0;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(j*i)+"\t");
			}
			System.out.println();
		}
	}
}
