package Access_modifiers_learn;

import Collections_learn.Array_list_learn;

public class Access_1  extends Array_list_learn{

	
	 static int a=20;
	 
	 protected static int c=30;
	
	public static int b=20;
	
	
	public static void print()
	{
		System.out.println("Print data");
	}
	
	public static void scan()
	{
		System.out.println("Scan data");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(c);
		
		System.out.println(a);

	}

}
