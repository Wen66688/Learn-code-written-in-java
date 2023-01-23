package com.wenlifen.java01demo01;

import java.util.Random;

public class Test19 {
	public static void main(String[]args) {
		
//		int num =  (int) (Math.random()*30);
		
//		System.out.println(num);
		
//		Random a = new Random();
//		int b = a.nextInt(50)+48;
//		System.out.println(b);
//		
//		char num1 = (char) (Math.random()*26+'A');
//		System.out.println(num1);
		
		
		
		
		int [] num3 = new int[10];
		
		
		int i=0;
		
		while(i<=9) {
			int num1 =  (int) (Math.random()*30)+1;
			boolean t=true;
			for(int j=0;j<num3.length;j++) {
				if(num1==num3[j]) {
					t=false;
				}	
			}
			if(t) {
				num3[i]=num1;
				System.out.println("num3["+i+"]:"+num3[i]);
				i++;
			}	
			
		}
		
		
		
	}
}
