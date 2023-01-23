package com.wenlifen.java01demo01;

import java.util.Scanner;

/*
 * author:wenlifen
 * date:2022.12.6
 * switch-case练习
 * 能被4整除,不能被100整除。能被400整除 为不是平年
 */
public class Test08 {
	public static void main(String [] args) {
//		become();
//		scores();
//		season();
		dayNumber();
	}
	public static void become() {
		Scanner s = new Scanner(System.in);
		System.out.println("输入26个小写字母中一个:");
		String letter = s.next();
		
		char word = letter.charAt(0);
		switch(word) {
		case 'a':
			System.out.print( Character.toUpperCase(word));
			break;
		case 'e':
			System.out.print( letter.toUpperCase());
			break;
		case 'i':
			System.out.print( letter.toUpperCase());
			break;
		case 'o':
			System.out.print( letter.toUpperCase());
			break;
		case 'u':
			System.out.print( letter.toUpperCase());
			break;
		default:
			System.out.print("other!");
			
		}
	}
	
	public static void scores() {
		String score="大于60分";
		switch(score) {
		case "大于60分":
			System.out.println("合格！");
			break;
		case "小于60分":
			System.out.println("不合格！");
			break;
		default:
			System.out.println("猜猜看！");
			
		}
	}
	
	public static void season() {
		Scanner s = new Scanner(System.in);
		System.out.println("输入一个(1-12)的数字会输出相对应的季节:");
		int data = s.nextInt();
		switch(data) {
		case 3:
		case 4:
		case 5:
			System.out.println("春天！");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏天！");
			break;
		case 9:
		case 10:
		case 11:
			System.out.print("秋天！");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬天！");
			break;
		default:
			System.out.println("让你输入1-12,偏要输入其他！无语！！！");
			
		}
	}
	public static void dayNumber() {
		Scanner n = new Scanner(System.in);
		System.out.println("输入月或者日,查看2019是多少天");
		System.out.print("月");
		int month = n.nextInt();
		System.out.print("日");
		int day = n.nextInt();
		int sum=0;
		for(int i=1;i<month;i++) {
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
				sum+=31;
			}else if(i==2) {
				sum+=28;
			}else {
				sum+=30;
			}	
		}
		sum+=day;
		System.out.print("天数:"+sum);
		
		
		
	}
}
