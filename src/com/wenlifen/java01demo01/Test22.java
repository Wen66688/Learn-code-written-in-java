package com.wenlifen.java01demo01;

import java.util.Arrays;

/*
 * Arrays工具类的使用
 * Arrays.equals
 * Arrays.toString
 * Arrays.sort
 * Arrays.fill
 * Arrays.binarySearch
 */
public class Test22 {
	
	public static void main(String[]args) {
		int [] arr1 = new int[] {1,2,3};
		int [] arr2 = new int[] {1,5,4,2};
		boolean isTrue = Arrays.equals(arr1, arr2);
		System.out.println(isTrue);
		
		String array = Arrays.toString(arr1);
		System.out.println(array);
		
		int [] arr3 = new int[3];
		arr3[0]=1;
		
		System.out.println(Arrays.binarySearch(arr2, 4)); //-2 什么鬼，为负数就是没有找到，1，5都可以
		
		Arrays.sort(arr2);
		System.out.println(	Arrays.toString(arr2));
		
		System.out.println(Arrays.toString(arr3));
		
		Arrays.fill(arr3, 2);
		System.out.println(Arrays.toString(arr3));
		
		
		
		
		
	}
	
}
