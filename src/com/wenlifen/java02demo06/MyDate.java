package com.wenlifen.java02demo06;

public class MyDate {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(12,3,2);
		MyDate date2 = new MyDate(12,13,2);
		System.out.println(date1.equals(date2));
	}
	
	private int year;
	private int month;
	private int day;
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		System.out.println(timeStandard());
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	public String timeStandard() {
		if((this.month>0&&this.month<13)) {
			int [] dayNumber = {31,28,31,30,31,30,31,31,30,31,30,31};
			if(this.year%4==0&&this.year%100!=0&&this.year%400==0) {
				dayNumber[1]=29;
			}
			if(this.day>=0&&this.day<=dayNumber[this.month-1]) {
				return "没有问题";
			}
		}
		
		return "年 或 月 或 日！有问题";
	}
	

}
