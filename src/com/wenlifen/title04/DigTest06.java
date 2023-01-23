package com.wenlifen.title04;

import java.util.Arrays;
import java.util.Scanner;

public class DigTest06 {
	public static void main(String[] args) {
		int [] num = {34,234,64,78,90};
//		Scanner s = new Scanner(System.in);
		int max = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println(max);
		int min = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println( min);
		int x =0;
		int n =0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==max) {
			x=i;
			}
			if(num[i]==min) {
				n=i;
				}
		}
		

		
	
		int t2 = min;
		num[n]=num[num.length-1];
		num[num.length-1] = t2;
		
		int t1 = max;
		num[x]=num[0];
		num[0] = t1;
		
		System.out.println(Arrays.toString(num));
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+"\t");
		}
	}
}
