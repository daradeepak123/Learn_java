package stringLearn;

public class LargestAndSmallestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="this is java program and find small and largesttt word";
		String s[]=str.split(" ");
		int length=0;
		String maxString="";
		for(int i=0;i<s.length;i++)
		{
			
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()>s[j].length())
				{
					length=s[i].length();
					maxString=s[i];
				}
				
			}
			
		}
		System.out.println(length +" "+ maxString);

	}

}
