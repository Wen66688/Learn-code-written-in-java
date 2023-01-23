package com.wenlifen.java01demo01;

import java.util.Scanner;

public class Test16 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int [] num = new int[5];
		System.out.println("请输入五位同学的成绩:");
	
		for(int i=0; i<num.length; i++) {
			num[i]=s.nextInt();
		}
		
		int max=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println("最高分数:"+max);
		
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>=(max-10)) {
				System.out.println("student\t"+i+"\tscore is\t"+num[i]+"\tgrade is A");
			}else if(num[i]>=(max-20)) {
				System.out.println("student\t"+i+"\tscore is\t"+num[i]+"\tgrade is B");
			}else if(num[i]>=(max-30)) {
				System.out.println("student\t"+i+"\tscore is\t"+num[i]+"\tgrade is C");
			}else {
				System.out.println("student\t"+i+"\tscore is\t"+num[i]+"\tgrade is D\t你是高手,差这么多！");
			}
		}
		
		
	}
	
	
}
