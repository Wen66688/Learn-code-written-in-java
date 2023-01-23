package com.wenlifen.title04;

public class DigTest01 {
	public static void main(String[] args) {
		DigTest01 dig = new DigTest01();
		int [] n = {23,534,623,63,67,346,78,4};
		int max=dig.max(n);
		System.out.println("其中的最大值:"+max);
		
	}
	
	
	public int max(int [] n) {
		int num = n[0];
		for(int i=0;i<n.length;i++) {
			if(n[i]>num) {
				num=n[i];
			}
		}
		return num;
	}
	
}
