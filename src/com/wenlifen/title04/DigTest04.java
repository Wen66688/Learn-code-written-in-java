package com.wenlifen.title04;

import java.util.Arrays;
import java.util.Scanner;

public class DigTest04 {
	public static void main(String[] args) {
		int [] num= new int[]{32,31,56,5,76,14,23};
		DigTest04 dig = new DigTest04();
		for(int i=0;i<dig.sort(num).length;i++){
			System.out.println(dig.sort(num)[i]);
		}
		Scanner s = new Scanner(System.in);
		System.out.println("输入一个整数:");
		int n = s.nextInt();
		int[] f = dig.count(num, n);
		for(int i=0;i<dig.sort(f).length;i++){
			System.out.println(dig.sort(f)[i]);
		}
		
}

//	排序
	public int[] sort(int [] num) {
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<(i);j++) {
				if(num[j]<num[j+1]) {
					int t = num[j];
					num[j]=num[j+1];
					num[j+1]=t;
				}
			}
		}
		return num;
	}
//	插入一个数
	public int[] count(int[]num,int n) {
		int []s = new int[num.length+1];
		for(int i=0;i<s.length;i++) {
			if(i==s.length-1) {
				s[s.length-1]=n;
			}else {
				s[i]=num[i];
			}
		}
		return s;
	}
}
