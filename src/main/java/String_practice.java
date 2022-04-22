import org.testng.annotations.Test;

import scala.Predef.StringFormat;

public class String_practice {

	
	@Test()
	public  void Test_pra() {
		// TODO Auto-generated method stub
		
		int zx;
		
		String name="abcdefghi";
		String hello="12345678";
		
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch); 
		System.out.println(s);
		
		int [] dee= {1,1049,210,450,3451,34,85};
		
		System.out.println(dee[5]);
		
		System.out.println();
		System.out.println(name.length());
		System.out.println(name.indexOf(0));
		System.out.println(name.charAt(1));
		System.out.println(name.compareTo("abcdefgh"));
		System.out.println(name.equals(hello));
		System.out.println(name.replace("a", "m"));
		
		if (name.equals(hello))
		{
			System.out.println("this is matching");
		}
		else 
		{
			System.out.println("not matching");
			
		}
		
		zx=10;
		System.out.println("zx value is"+ zx);
		
		System.out.println();
		
		for (int i=0; i<name.length(); i++)
		{
			
			
			System.out.println(i);
			
			if (i==4)
			{
				break;
			}
			
		}
		

	}

}
