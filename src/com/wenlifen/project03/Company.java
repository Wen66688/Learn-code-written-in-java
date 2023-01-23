package com.wenlifen.project03;

public class Company {
	
	private int total;
	private BigDevelop[] bigDevelop;
	
	public Company() {
		this.total=12;
		bigDevelop = new BigDevelop[this.total];
		bigDevelop[0]= new BigDevelop("马云","22","3000.0","","","","","");
		bigDevelop[1]= new BigDevelop("马化腾","32","18000.0","架构师","FREE","15000.0","2000","联想");
		bigDevelop[2]= new BigDevelop("李彦宏","23","7000.0","程序员","FREE","","","戴尔");
		bigDevelop[3]= new BigDevelop("刘强东","34","37000.0","程序员","FREE","","","戴尔");
		bigDevelop[4]= new BigDevelop("雷军","26","13000.0","设计师","FREE","5000.0","","激光");
		bigDevelop[5]= new BigDevelop("任志强","28","13000.0","程序员","FREE","","","华硕");
		bigDevelop[6]= new BigDevelop("柳传志","21","10000.0","设计师","FREE","5200.0","","华硕");
		bigDevelop[7]= new BigDevelop("杨元庆","24","3000.0","架构师","FREE","15000","2500","针式");
		bigDevelop[8]= new BigDevelop("史玉柱","37","7000.0","设计师","FREE","5500.0","","惠普");
		bigDevelop[9]= new BigDevelop("丁磊","37","13000.0","程序员","FREE","","","戴尔");
		bigDevelop[10]= new BigDevelop("张朝阳","42","9000.0","程序员","FREE","","","华硕");
		bigDevelop[11]= new BigDevelop("杨致远","31","83000.0","设计师","FREE","4800.0","","惠普");
		
	}
	
	public Company(int total) {
		this();
		if(total>12) {
			this.total=total;
		}
	}

	public Company(int total, BigDevelop[] bigDevelop) {
		super();
		this.total = total;
		this.bigDevelop = bigDevelop;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public BigDevelop[] getBigDevelop() {
		return bigDevelop;
	}

	public void setBigDevelop(BigDevelop[] bigDevelop) {
		this.bigDevelop = bigDevelop;
	}
	
	public void companyPersonList() {
		
		for(int i=0;i<this.bigDevelop.length;i++) {
			int t = i+1;	
	
			System.out.println( t+"\t"+bigDevelop[i].getName()+"\t"+bigDevelop[i].getAge()+"\t"+bigDevelop[i].getSalary()+"\t"+bigDevelop[i].getPosition()+"\t"+bigDevelop[i].getState()+"\t"+bigDevelop[i].getPrize()+"\t"+bigDevelop[i].getStock()+"\t"+bigDevelop[i].getSetUp());
		}
		
	
		
	}

	
	
}
