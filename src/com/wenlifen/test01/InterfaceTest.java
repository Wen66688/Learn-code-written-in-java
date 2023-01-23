package com.wenlifen.test01;

public class InterfaceTest {
	public static void main(String[] args) {
		String [] f = new String[] {"1","2","3","4","5","6"};
		for(int i=0; i<f.length;i++) {
			System.out.print(f[i]+"\t");
			
		}
		System.out.println();
		for(int i=0; i<f.length;i++) {
			if(i<f.length-1) {
				f[i]=f[i+1];
			}else if(i==f.length-1) {
				f[i]=null;
			}
			
		}
		
		for(int i=0; i<f.length;i++) {
			System.out.print(f[i]+"\t");
			
		}
		
		
	}

	

}
abstract class AbstractOne{
	int n=1;
	int h;
	public  AbstractOne() {};
	public abstract void love();
	public void happy() {};
	public static void flee() {};
	class B{};
	{};
	static {};
}
interface InterfaceOne{
	static final int NUM=1;
	public abstract void find();
	public static void say() {};
	public default void eat() {};
	class A{}
	
}
interface InterfaceTwo{
	static final int NUM=1;
	public abstract void find();
	public static void say() {};
	public default void eat() {};
	class A{}
}

class C extends AbstractOne implements InterfaceTwo,InterfaceOne{

	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void love() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		InterfaceOne.super.eat();
	}
	
}
