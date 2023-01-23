package com.wenlifen.project01;

public class DetailPage {
	private double num;
	private String[] str;
	
	
	public String[] getStr() {
		return str;
	}

	public void setStr(String[] str) {
		this.str = str;
	}

	public DetailPage() {}
	
	public DetailPage(double num) {
		super();
		this.num = num;
	}
	
	

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	};
//	账户金额 支出
	public String moneyExpend(double n,String s){
		if(this.num>=n) {
			 num-=n;
		}else {
			System.out.println("抱歉你的账户金额没有那么多钱！");
		}
		return "支出\t"+n+"\t"+s;
	}
//  账户金额 收入
	public String moneyIncome(double n,String s){
		 num+=n;
		 return "收入\t"+num+"\t"+n+"\t"+s;
//		return "收入\t"+num+"\t"+n+"\t"+s;
	}
// 记录输出
	public void moneyOut(String[] s) {
		str = s;
		for(int j=0;j<str.length;j++) {
			if(str[j]==null) {
				
			}else {
				System.out.println(str[j]);
			}
		}
	}
	
}
