package com.wenlifen.java02demo02;

public class Student extends Person {
	long number;
	int math;
	int english;
	int computer;
	
	public Student(String n,char s,int a,long k,int m, int e,int c) {
		super(n,s,a);
		number = k;
		math = m;
		english = e;
		computer = c;
	}
	
	public double aver() {
		double averNumber = (this.math+this.english+this.computer)/3;
		return averNumber;
	}
	public int max() {
		int max = (this.math>this.english?this.math:this.english);
		int maxNumber = max>this.computer?max:this.computer;
		return maxNumber;
	}
	public int min() {
		int min = (this.math<this.english?this.math:this.english);
		int minNumber = min<this.computer?min:this.computer;
		return minNumber;
	}
	
	@Override
	public String toString() {
		String str = super.toString()+"\tnumber="+number+"\taver="+aver()+"\tmax="+max()+"\tmin="+min();
		return str;
	}
	
}
