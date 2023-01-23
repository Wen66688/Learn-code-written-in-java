package com.wenlifen.java02demo03;

public class Kids extends ManKind{
	int yearsOld;
	
	@Override
	public void employeed() {
		// TODO Auto-generated method stub
		System.out.println("Kids should study and no job");
	}
	public void printAge() {
		System.out.println("yearsOld:"+this.yearsOld);
	}
}
