import java.util.HashMap;
import java.util.Map;

public class InnoPreFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Innovaccer";
		
		Map<Character,Integer> hashMap=new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(hashMap.containsKey(s.charAt(i)))
			{
				int a=hashMap.get(s.charAt(i));
				hashMap.put(s.charAt(i), a+1);
				
			}
			else
			{
				hashMap.put(s.charAt(i), 1);
			}
			
			
			
		}
		
		//System.out.println(hashMap);
		for(Map.Entry e: hashMap.entrySet())
		{
			System.out.println(e.getKey() +" " + e.getValue());
			
			
			
			
		}
		
		
	}

}
