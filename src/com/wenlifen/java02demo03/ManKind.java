package com.wenlifen.java02demo03;

public class ManKind {
	int sex;
	int salary;
	public void manOrWoman() {
		if(sex==1) {
			System.out.println("sex=man");
		}else if(sex==2) {
			System.out.println("sex=woman");
		}else {
			System.out.println("sex只能为1或者为2！！！");
		}
	}
	public void employeed() {
		if(salary==1) {
			System.out.println("salary=no job");
		}else{
			System.out.println("salary=job");
		}
	}
}
