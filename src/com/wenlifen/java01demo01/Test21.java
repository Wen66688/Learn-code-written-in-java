package com.wenlifen.java01demo01;

public class Test21 {
	public static void main(String[]args) {
		int [] array1;
		int [] array2;
		array1=new int[] {2,3,5,7,11,13,17,19};
		for(int i=0; i<array1.length;i++) {
			System.out.print("array1["+i+"]:"+array1[i]+"\t");
		}
		System.out.println();
//		浅复制
		array2 = new int [array1.length];
		for(int i=0; i<array1.length;i++) {
			array2[i]=array1[i];
		}
		for(int i=0; i<array2.length;i++) {
			if(i%2==0) {
				array2[i]=i;
				
			}
			System.out.print("array2["+i+"]:"+array2[i]+"\t");
		}
		
		System.out.println();
		
		for(int i=0; i<array1.length;i++) {
			System.out.print("array1["+i+"]:"+array1[i]+"\t");
		}
//		深复制 复制地址值
		System.out.println();
		array2=array1;
		for(int i=0; i<array2.length;i++) {
			if(i%2==0) {
				array2[i]=i;
			}
			System.out.print("array2["+i+"]:"+array2[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<array1.length;i++) {
			System.out.print("array1["+i+"]:"+array1[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
		}
		System.out.println();
//		数组反转
		for(int i=0;i<(array1.length/2);i++) {
			int num = array1[i];
			array1[i]=array1[array1.length-1-i];
			array1[array1.length-1-i]=num;			
		}
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+"\t");
		}
		
		
	}
}
