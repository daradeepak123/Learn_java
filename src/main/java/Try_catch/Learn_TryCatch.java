package Try_catch;

import java.io.FileInputStream;

public class Learn_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			
			float a=20;
			float b=0;
			
			System.out.println(a/b);
			
			System.out.println("above line is exception");
			System.out.println(a+30);
			
			
		}
		catch(ArithmeticException fis)
		{
			System.out.println("fis exception "+fis.getMessage());
		}
		catch(Exception e)
		{
			
			System.out.println("normal exception "+e.getMessage());
		}
		
		try {
		int[] i= {1,2,3,4,5,6,7}; 
		
		for (int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		
		
		
		//System.out.println(i[10]);
		}
		catch (ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("out of boundry "+ab.getMessage());
		}
		

	}

}
