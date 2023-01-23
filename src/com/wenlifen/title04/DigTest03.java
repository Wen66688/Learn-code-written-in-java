package com.wenlifen.title04;

public class DigTest03 {
	public static void main(String[] args) {
		int [][] num = {{23,53,56},{34,23,12},{35,31,6}};
		DigTest03 dig = new DigTest03();
		int sum=dig.sum(num);
		System.out.println("对角线之和:"+sum);
	}

	public int sum(int[][]num) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(i==j) {
					sum+=num[i][j];
				}
			}
		}
		
		return sum;
	}
}
