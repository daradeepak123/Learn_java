package stringLearn;

public class SentenceToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="hello welcome to java world";
		
		String words[]=str.split(" ");
		String nwords[]=new String[words.length];
		
		for(int abc=0;abc<words.length;abc++)
		{
			String s=words[abc];
			char ch=' ';
			String rev="";
			for(int i=0;i<s.length();i++)
			{
				ch=s.charAt(i);
				rev=ch+rev;
			}
			
			nwords[abc]=rev;
			System.out.println(rev);
		}
		for(String ss:nwords)
		{
		System.out.print(ss + " ");
		}
		
		
		

	}

}
