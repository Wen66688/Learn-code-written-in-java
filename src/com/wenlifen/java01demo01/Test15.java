package com.wenlifen.java01demo01;

public class Test15 {
	public static void main(String[]args) {
		int [] arr = new int[] {8,2,1,0,3};
		int [] index = new int[] {2,0,3,2,4,0,1,3,2,3,3};
		String tel = "";
		for(int i=0; i<index.length;i++) {
			tel+=arr[index[i]];
		}
		System.out.println("联系方式:"+tel);
		int [][] num = new int[][] {{1,2}};
		int [][] num1 = new int[3][3];
		int [][] num2 = new int [2][];
		int [][] num3 = {{3,2,3}};
		
	}
}
