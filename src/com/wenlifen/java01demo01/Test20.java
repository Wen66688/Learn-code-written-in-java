package com.wenlifen.java01demo01;

public class Test20 {
	public static void main(String[]args) {
		int [] arr = new int[10];
//		随机赋值
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int) ((Math.random()*90)+10);		
		}
//		最小值
		int min = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("最小值:"+min);
//		最大值
		int max = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("最大值:"+max);
		
//		平均值与总和
		double sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		double mean = sum/arr.length;
		
		System.out.println("平均值:"+mean);
		System.out.println("总和:"+sum);
		
	}

}
