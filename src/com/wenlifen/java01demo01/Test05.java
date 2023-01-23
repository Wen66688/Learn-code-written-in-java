package com.wenlifen.java01demo01;
/*
 * date: 2022.12.6
 * if-else练习
 */
public class Test05 {
	public static void main(String[]args) {
		
		double num=5;
		double sum=0;
		if(num>=0&&num<=2) {
			for(int i=0; i<num;i++) {
				sum+=10.5;
			}
		}else {
			sum+=21;
			for(int i=0;i<3;i++) {
				sum+=4;
			}
		}
		System.out.println("Sum:"+sum);
		
		
	}
}
