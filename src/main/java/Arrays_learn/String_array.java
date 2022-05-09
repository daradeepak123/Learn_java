package Arrays_learn;

public class String_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String a[]= {"India","The","Great","I","Love","My","Country"};
		
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
			
			
			if (a[i]=="The")
			{
				System.out.println();
				
				System.out.println("breaked the loop");
				break;
			}
		}
		
		
		char ab[]= {'a','v','e','r','b','@'};
		
		
		
		
		System.out.println(a[1]);
		
//		for (int i=0;i<=a.length;i++)
//		{
//			System.out.print(ab[i]);
//		}
		
		
		
		int n=5;
		
		for (int i=1;i<=n;i++)
		{
			System.out.println("loop value is "+i);
		}
		
		
		
		
		

	}

}
