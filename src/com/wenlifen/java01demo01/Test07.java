package com.wenlifen.java01demo01;

import java.util.Scanner;

/*
 * date: 2022.12.6
 * if-else练习
 */
public class Test07 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("身高(cm):");
		double hight = s.nextDouble();
		System.out.println("资产(w):");
		double rich = s.nextDouble();
		System.out.println("是否帅(true/false):");
		boolean beautiful = s.nextBoolean();
		String result;
		if(hight>=180&&beautiful&&rich>=1000) {
			result = "我一定要嫁给他！！！";
		}else if(hight>=180||beautiful||rich>=1000) {
			result = "嫁吧！比上不足，比下有余。";
		}else {
			result = "不嫁！";
		}
		System.out.println("结果:"+result);
		
	}
}
