package stringLearn;

public class BasicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Learn Java";
		
		System.out.println(str.offsetByCodePoints(2, 4));
		//System.out.println(str.repeat(2));
		System.out.println(str.replace('a', 'r'));
		System.out.println(str.replaceFirst("ar", "rr"));
		System.out.println(str.startsWith("Le"));
		//System.out.println(str.split("a"));
		
		String ss[]=str.split("a");
		System.out.println(ss);

		for(String s:ss)
		{
			System.out.println(s);
		}
	}

}
