package com.wenlifen.java02demo01;

public class Test06 {
	public static void main(String[]ars) {
		MyDate myDate = new MyDate();
		myDate.year=2001;
		myDate.month=9;
		myDate.day=25;
		myDate.message();
		MyDate youDate = new MyDate();
		youDate.year=2000;
		youDate.month=8;
		youDate.day=29;
		youDate.message();
		
	}

}
class MyDate{
	int year;
	int month; 
	int day;
	public void message() {
		System.out.println("year:"+year+"month:"+month+"day:"+day);
	}
}
