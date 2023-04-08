package stringLearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="asdetvds12335324!#$$@#$";
		
		
		String spl="[!@#$%^&*()_,.:]";
		
		Pattern ptn=Pattern.compile(spl);
		Matcher mthc=ptn.matcher(str);
		
		String numm="[0-9]";
		
		Pattern numptn=Pattern.compile(numm);
		Matcher nummatch=numptn.matcher(str);
		while(nummatch.find())
		{
			System.out.println(nummatch.group());
		}
		
		while(mthc.find())
		{
			System.out.println(mthc.group());
		}
		
		
		int dig = 0,alph=0,spe=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				alph++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				dig++;
			}
			else
			{
				spe++;
			}
		}
		
		System.out.println("Special chars are " +spe +" digits are "+dig+" alphabets are" + alph);
		
		
		
		

		
		String s="ababbabababbbabababababab";
		String ss="ab";
		int sount=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.substring(i, i+2).equals(ss))
			{
				System.out.println(s.substring(i, i+2));
				sount++;
			}
		}
		
		System.out.println(sount);
		
		
		
		
	}

}
