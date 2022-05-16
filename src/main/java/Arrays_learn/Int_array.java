package Arrays_learn;

import java.util.Iterator;

import javax.mail.search.IntegerComparisonTerm;

public class Int_array {
	
	
	private static int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a[]= {1,5,25,32,89,43};
		
		
		
		
		for (int z: a)
		{
			
			if(z==25)
			{
				break;
			}
			System.out.println(z);
		}
		
		
		
		
		System.out.println("Value present at position 3 is--->  "+a[2]);
		
		System.out.println("value at position 1 is---> "+a[0]);
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println("value of array at position ---->"+a[i]);
			
			if (a[i]==100)
			{
				System.out.println("breaking the loop because it got match");
				
				break;
			}
			
			
		}
		
		
		int j=0;
		
		
		for (int i=0;i<a.length;)

		{
			j++;
			System.out.println("value of j is"+j);
			
			if (j==1000)
			{
				break;
			}
			
		}
		
		

	}

}
