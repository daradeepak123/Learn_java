package stringLearn;

public class PrintWordsFromNumbersss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String num="23454";
		
		
		int a=num.length();
		
		for(int i=0;i<num.length();i++)
		{
			if(num.charAt(i)=='1')
			{
				System.out.print("one ");
			}
			
			if(num.charAt(i)=='2')
			{
				System.out.print("two ");
			}
			
			if(num.charAt(i)=='3')
			{
				System.out.print("three ");
			}
			
			if(num.charAt(i)=='4')
			{
				System.out.print("four ");
			}
			
			if(num.charAt(i)=='5')
			{
				System.out.print("five ");
			}
			
			if(num.charAt(i)=='6')
			{
				System.out.print("six ");
			}
			
			if(num.charAt(i)=='7')
			{
				System.out.print("seven ");
			}
			
			if(a>1)
			{
				
				if (a==3)
				{
					System.out.print("hundred ");
				}
				if (a==4)
				{
					System.out.print("thousand ");
				}
			
			}
			a--;
			
		}
		
		

	}

}
