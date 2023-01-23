package com.wenlifen.java01demo01;

import java.util.Scanner;

/*
 * date : 2022.12.6
 * if-else练习
 * 
 */

public class Test01 {
	
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.print("输入小白java考试分数:");
		double scores = s.nextDouble();
		
		if(scores==100) {
			System.out.println("奖励一台BMW");
		}else if(scores>80&&scores<=90) {
			System.out.println("奖励一台iphone xs max");
		}else if(scores>=60&&scores<=80) {
			System.out.println("奖励一个iPad");
		}else {
			System.out.println("不及格还有脸要东西");
		}
		
		
	}
	
	
	
}
