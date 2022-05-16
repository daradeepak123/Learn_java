package OOPS_learn;

public class COnstructor_overloading {
	
	int a;
	int b;
	
	COnstructor_overloading()
	{
		int a=20;
		int b=50;
		this.a=10;
		this.b=20;
		
		System.out.println("Constructor with out parameter "+(this.a+this.b));
		
	}
	
	COnstructor_overloading(int a,int b)
	{
		this.a=a;
		this.b=b;
		
		System.out.println("constructor with 2 parameters "+(a+b));
		
	}
	
	COnstructor_overloading(int a,double b)
	{
		this.a=a;
		double c=b;
		
		System.out.println("constructor with int and double parameter "+(a+b));
		
	}
	
	COnstructor_overloading(int a,int b, int c)
	{
		this.a=a;
		this.b=b;
		c=c;
		
		System.out.println("constructor with 3 parameters "+(a+b+c));
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		COnstructor_overloading con=new COnstructor_overloading();
		
		

		COnstructor_overloading con_2parameters=new COnstructor_overloading(10,50);
		

		COnstructor_overloading con_3parameters=new COnstructor_overloading(10,50,20);
		

		COnstructor_overloading con__Float_parameters=new COnstructor_overloading(10,20.2342312);
		
		
		
		

	}

}
