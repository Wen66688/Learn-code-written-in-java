package com.wenlifen.java02demo01;

public class Test05 {
	public static void main(String[]args) {
		Students[] students = new Students[20];
		
		
		
		
		for(int i=0;i<students.length;i++) {
			students[i]=new Students();
			students[i].number=(i+1);
			students[i].state=(int) (Math.random()*6)+1;
			students[i].score=(int) (Math.random()*100)+1;	
		}
		
		for(int i=0;i<students.length;i++) {
			if(students[i].state==3) {
				students[i].message();
			}
		}
		
		for(int i=0;i<students.length;i++) {
			
			System.out.print(students[i].score+"\t");
		}
		
		for(int i=0;i<students.length;i++) {
			for(int j=0;j<students.length-i-1;j++) {
				if(students[j].score>students[j+1].score) {
					int temp = students[j].score;
					students[j].score = students[j+1].score;
					students[j+1].score= temp;
					
				}
			}
		}
		System.out.println();
		
		for(int i=0;i<students.length;i++) {			
//			System.out.print(students[i].score+"\t");
			students[i].message();
		}
		
		
		
		
		
	}

}
class Students{
	int number;//学号
	int state;//年级
	int score;//成绩
	
	public void message() {
		System.out.println("number:"+number+"state:"+state+"score:"+score);
	}
}
