package stringLearn;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="LearnJava";
		
		
		System.out.println(str.charAt(0));
		System.out.println(str.codePointAt(3));
		System.out.println(str.compareTo("appleapple"));
		System.out.println(str.concat("hello"));
		System.out.println(str.contains("Java"));
		System.out.println(str.contentEquals("LearnJava"));
		System.out.println(str.endsWith("a"));
		System.out.println(str.equalsIgnoreCase("Learnjava"));
		System.out.println(str.indexOf('L'));
		System.out.println(str.lastIndexOf('L'));
		System.out.println(str.length());
		System.out.println(str.indexOf('L', 0));
		
		
		
		

	}

}
