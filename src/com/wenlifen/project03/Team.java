package com.wenlifen.project03;

public class Team {
	
	private int total;
	private SmallDevelop[] smallDevelop;
	
	public Team() {
		this.total=0;
	}
	public Team(int total) {
		this.total=0;
//		this.total=total;
		smallDevelop = new SmallDevelop[total];
	}
	
	public Team(int total, SmallDevelop[] smallDevelop) {
		super();
		this.total=0;
		this.smallDevelop = smallDevelop;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
	public SmallDevelop[] getSmalldevelop() {
		return smallDevelop;
	}

	public void setSmalldevelop(SmallDevelop[] smallDevelop) {
		this.smallDevelop = smallDevelop;
	}
	//团队列表
	public void seeSmallPerson() {
		if(this.total<=0) {
			System.out.println("对不起还没有团队成员！");
		}else {
				for(int i=0;i<this.total;i++) {
					int t = i+1;
					System.out.println(t+"/"+smallDevelop[i].getId()+"\t"+smallDevelop[i].getName()+"\t"+smallDevelop[i].getAge()+"\t"+smallDevelop[i].getSalary()+"\t"+smallDevelop[i].getPosition()+"\t"+smallDevelop[i].getPrize()+"\t"+smallDevelop[i].getStock());
				}
			
		}
	}
	
	//添加团队成员
	public String addSmallPerson(int id,String name, String age, String salary, String position, String prize, String stock,String state) {
		if(this.total>=this.smallDevelop.length) {
			return "添加失败，原因该团队人数已满！";
		}
		if(position.equals("")) {
			return "添加失败，原因该成员不是开发人员，无法添加！";
		}
		int time = 1;
		int times =1;
		for(int i=0;i<this.total;i++) {
			int t = i+1;
			
			if(smallDevelop[i].getId()==id) {
				return "添加失败，原因该成员已经是本团队成员，无法添加！";
			}
			if(position.equals("架构师")) {
				if(smallDevelop[i].getPosition().equals(position)) {
					return "添加失败，团队中至多只能有一名架构师，无法添加！";
				}
			}
			if(position.equals("设计师")) {
				if(smallDevelop[i].getPosition().equals(position)) {
					time+=1;
					if(time==3) {
						return "添加失败，团队中至多只能有俩名设计师，无法添加！";
					}
				}
			}
			if(position.equals("程序员")) {
				if(smallDevelop[i].getPosition().equals(position)) {
					times+=1;
					if(times==4) {
						return "添加失败，团队中至多只能有三名程序员，无法添加！";
					}
				}
			}
			
		}
		if(!state.equals("FREE")) {
			return "添加失败，原因该成员已经休假，无法添加！";
		}
//		原因该成员已经是其他团队成员 还没写
		
		
		smallDevelop[this.total] = new SmallDevelop(id,name,age,salary,position,prize,stock);
		
		this.total++;
		
		return "添加成功";
	}
	
	//删除团队成员
	public boolean deleteSmallPerson(int num) {
		int n = num-1;
		if(n>this.total||n<0) {
			return false;
		}
		for(int i=n;i<this.total;i++) {
			smallDevelop[i]=smallDevelop[i+1];
		}
		smallDevelop[this.total-1]=null;
		this.total--;
		return true;
	}
	
}
