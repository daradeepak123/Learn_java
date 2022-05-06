
public class For_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc="JAVATRAINING";
		
		System.out.println(abc.charAt(0));
		
		String rev = "";
		char charval;
		
		for (int i=0;i<abc.length();i++)
		{
			
			charval=abc.charAt(i);
			
			rev=charval+rev;
			
		}
		System.out.println(rev);
		
		

		int j=100;
		int v=0;
		
		int b[]= {1,3,41,4,3,2};
		
		System.out.println(b[1]);
		
		for (int c: b)
		{
			System.out.println("array value  "+c);
		}
		
		
		for (int i=0; i<b.length; i++)
		{
			
			System.out.println(i);
		}
		for (int i=0;i<j;)

		{
			v++;
			System.out.println(v);
			if (v==10)
			{
				break;

			}

		}

	}

	

}
