package Inheretence_pack;

import org.testng.annotations.Test;

public class B extends A{
	
	int c;
	int d;
	
	void classB(int c,int d)
	{
		this.c=c;
		this.d=d;
		System.out.println(this.c+this.d);
	}
	
	void classA(int a,int b)
	{
		System.out.println((a+b)+30);
	}
	
	
	
	@Test
	public void inh()
	{
		a=20;
		b=40;
		c=50;
		d=80;
		
		classA(20,50);
		
		
	}

}
