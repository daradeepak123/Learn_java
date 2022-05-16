package OOPS_learn;

public class Constructor_multi extends COnstructor_overloading{
	
	int a;
	int b;
	int c;
	
	Constructor_multi(int x,int y)
	{
		a=x;
		b=y;
		
		System.out.println(a+b);
	}
	
	Constructor_multi(int x,int y, int z)
	{
		a=x;
		b=y;
		c=y;
		
		System.out.println(a+b+c);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_multi ob=new Constructor_multi(20,30);
		
		Constructor_multi ob1=new Constructor_multi(20,30,50);
		
		Constructor_multi ob2=new Constructor_multi(10,10);
			

	}

}
