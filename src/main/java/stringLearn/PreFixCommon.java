package stringLearn;

import java.util.HashMap;
import java.util.Map;

public class PreFixCommon {
	
	
	
	
	public static String findCommonPrefix(String[] strings) {
	    if (strings == null || strings.length == 0) {
	        return "";
	    }

	    String prefix = "";
	    String firstString = strings[0];

	    for (int i = 0; i < firstString.length(); i++) {
	        char c = firstString.charAt(i);

	        for (int j = 1; j < strings.length; j++) {
	            if (i >= strings[j].length() || strings[j].charAt(i) != c) {
	                return prefix;
	            }
	        }

	        prefix += c;
	    }

	    return prefix;
	}

	
	
	public static String pre()
	{
		String strings[]= {"apple","application","apol"};
		
		
		String firstString=strings[0];
		String prefix="";
		for(int i=0;i<firstString.length();i++)
		{
			char c=firstString.charAt(i);
			for(int j=1;j<strings.length;j++)
			{
				if(i>=strings.length|| strings[j].charAt(i)!=c)
				{
					return prefix;
				}
			}
			prefix+=c;
			
		}
		return prefix;
	}
	
	
	
	public static void common()
	{
		String str="common numbers";
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				int a=map.get(str.charAt(i));
				map.put(str.charAt(i), a+1);
			}
			else
			{
				map.put(str.charAt(i), 1);
			}
			
		}
		System.out.println(map);
		
		for(Map.Entry mm:map.entrySet())
		{
			System.out.println(mm.getKey() +" "+ mm.getValue());
			
			
			
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] strings = {"apple", "application", "aptitude"};
		String commonPrefix = findCommonPrefix(strings);
		System.out.println("Common prefix: " + commonPrefix);
		
		System.out.println(pre());
		common();

	}

}
