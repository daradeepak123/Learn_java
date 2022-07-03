package Exceptions_learn;

public class UncheckedExcepitions_learn {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("before exception");
		try {
		int i=20;
		//System.out.println(i/0);
		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally blo");
		}
		
		
		System.out.println("after exception");
		
		String str=null;
	//	System.out.println(str.length());
		
		
//		String ab="20";
//		String bc="40";
//		String abc=ab+bc;
//		System.out.println(abc+1);
//		
//		int cba=Integer.parseInt(abc);
//		System.out.println(cba+1);
		
		
		
		String st="123456a";
		
		
		
//		int a=Integer.parseInt(st);
//		System.out.println(a);
		
		int ar[]=new int[3];
		
		ar[0]=10;
		ar[1]=40;
		ar[2]=30;
		//ar[3]=50;
		
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);
		
		for (int j=0;j<ar.length;j++)
			
		{
			System.out.println(ar[j]);
		}
		
		
		
		
		

	}

}
