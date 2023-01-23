package com.wenlifen.java02demo08;

import java.util.Scanner;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("输入学生的成绩，当为负数时停止就会停止输入！");
		Vector v = new Vector();
		
		boolean t = true;
		
		while(t) {
			int num = s.nextInt();
			if(num>=0) {
				Integer num1 = num;
				v.addElement(num1);
			}else {
				t=false;
			}
		}
		
		System.out.println("长度："+v.size());
	
		
		int max = (int) v.elementAt(0);
		for(int i=0;i<v.size();i++) {
			if((int)v.elementAt(i)>max) {
				max=(int)v.elementAt(i);
			}
		}
		System.out.println("最大值:"+max);
		for(int i=0;i<v.size();i++) {
			if((int)v.elementAt(i)>(max-10)) {
				System.out.println(v.elementAt(i)+"为A等");
			}else if((int)v.elementAt(i)>(max-20)) {
				System.out.println(v.elementAt(i)+"为B等");
			}else if((int)v.elementAt(i)>(max-30)) {
				System.out.println(v.elementAt(i)+"为C等");
			}else {
				System.out.println(v.elementAt(i)+"为D等");
			}
		}
		
		
		
	}
}
