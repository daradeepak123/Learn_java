import org.testng.annotations.Test;

public class String_new extends String_practice{
	
	@Test()
	public void test2()
	{
		String str="danger";
		char ch;
		String revstr="";
		
		System.out.println("original word is "+str);
		
		for (int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			revstr=ch+revstr;
			System.out.println(revstr);
		}
		System.out.println(revstr);
		
	}

}
