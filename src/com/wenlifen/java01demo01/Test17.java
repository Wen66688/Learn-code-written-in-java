package com.wenlifen.java01demo01;

public class Test17 {
	public static void main(String[]args) {
		
		int [][] arr = new int[][] {{3,5,8},{12,9},{7,0,6,4}};
		int sum=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("和:"+sum);
		
	}

}
