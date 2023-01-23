package com.wenlifen.title03;

public class DigTest01 {
	public static void main(String[] args) {
		outer: for(int i=2;i<=50;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					continue outer;
				}
			}
			
		}
		System.out.println(new DigTest01().jf());
	}
	
	public int jf() {
		
		return Integer.getInteger("42");
	}
}
