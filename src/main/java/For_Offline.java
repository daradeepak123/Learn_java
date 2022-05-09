
public class For_Offline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		//reverse string
		String str="JAVALEARNING";
		
		//GNINRAELAVAJ
		
		char c;
		String rev="";
		
		for (int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			rev=c+rev;
			
			
		}
		System.out.println("reverse String is---> "+rev);
		
		

		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		

		for (int h: a)
		{
		
		System.out.println(h);
		}
		
		String st[]= {"abc","bac","zxd"};
		

		
		
		
		

	}

}
