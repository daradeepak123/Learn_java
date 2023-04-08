package stringLearn;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="HEllo This is duplicate string";
		
		
		
		for(int i=0;i<str.length();i++)
		{
			int count =1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j) && str.charAt(j)!='*')
				{
					count++;
					String ch="*";
					String old=String.valueOf(str.charAt(j));
					str=str.replace(old, ch); 
				}
				
			}
			if(count>1)
			System.out.println("repeated char " + str.charAt(i) + " repeated for " + count);
		}
		
		
		System.out.println(str);
	}

}
