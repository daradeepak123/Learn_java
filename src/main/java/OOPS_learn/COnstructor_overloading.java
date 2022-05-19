package OOPS_learn;

public class COnstructor_overloading {
	
	static int a;
	static int b;
	
	
	COnstructor_overloading()
	{
		a=20;
		b=40;
		int a =20;
		int b=30;
		a=10;
		b=20;
		b=40;
		this.a=60;
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
	
	
	void hello()
	{
		int j;
		a=40;
		b=60;
	}
	
	static void hellow()
	{
		 int j;
		a=40;
		b=60;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a=40;
		
		main(20);
		
		COnstructor_overloading con=new COnstructor_overloading();
		con.a=40;
		
		con.main(10);

		COnstructor_overloading con_2parameters=new COnstructor_overloading(10,50);
		con_2parameters.main(20);

		COnstructor_overloading con_3parameters=new COnstructor_overloading(10,50,20);
		

		COnstructor_overloading con__Float_parameters=new COnstructor_overloading(10,20.2342312);

	}
	
	
	public static void main(int a) {
		
		boolean h=true;
		System.out.println(h);
		
		int r=a;
		System.out.println(r);
		
		
		System.out.println("another main");
	}
	
	

}
