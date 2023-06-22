package stringLearn;

public class SpecialCharsAlphaNumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="HelloJav@Le@Rn!()$%";   
		
		int caps=0,small=0,special=0;
		
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				caps++; 
			}
			else if (Character.isLowerCase(str.charAt(i)))
			{
				small++;
			}
			else
			{
				special++;
			}
			
		}
		System.out.println("Captial letters in the string are " +caps);
		System.out.println("Small letters in the string are " + small);
		System.out.println("Special chars are " +special);
		

	}

}
