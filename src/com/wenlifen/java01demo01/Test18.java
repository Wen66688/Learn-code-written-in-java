package com.wenlifen.java01demo01;

import java.util.Scanner;

public class Test18 {
	
	public static void main(String[]args) {
		System.out.println("打印杨辉三角:");
		
		Scanner s = new Scanner(System.in);
		
//		System.out.println("输入杨辉三角的行:");
//		int i = s.nextInt();
//		int j = i;
		
		int [][] yanghui = new int[10][];
		
		for(int i=0;i<yanghui.length;i++) {
//			yanghui=new int[10][i+1];
			yanghui[i]=new int[i];
			for(int j=0;j<yanghui[i].length;j++) {
				yanghui[i][0]=1;
				yanghui[i][yanghui[i].length-1]=1;
				
				if(i>=2&&j>=1&&j<yanghui[i].length-1) {
//				System.out.println("i="+i+"j="+j);
//				System.out.print(yanghui[i][j]);
//				System.out.print(yanghui[1][0]);
//				System.out.print(yanghui[i-1][j]);
//				System.out.println();
				yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
				
				}
				
				System.out.print("yanghui["+i+"]["+j+"]:\t"+yanghui[i][j]+"\t");
			}
			System.out.println();
		}
		
	
		
	}

}
