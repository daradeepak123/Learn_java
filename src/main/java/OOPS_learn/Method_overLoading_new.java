package OOPS_learn;

public class Method_overLoading_new {
	
	
	
	void sum()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	void sum(int v,int n)
	{
		int a=v;
		int b=n;
		System.out.println(a+b);
		
	}
	
	
	
	void sum(int q, int l, int f)
	{
		int a=f;
		int b=q;
		int c=l;
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_overLoading_new ob=new Method_overLoading_new();
		ob.sum();
		ob.sum(10000, 200000);
		ob.sum(30, 50, 80);
		
		
		
		

	}

}
