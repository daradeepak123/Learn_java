package stringLearn;

public class RemoveSpecialCharecters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello+-^Java+ -Programmer^ ^^-- ^^^ +!";  
		str = str.replaceAll("[-+^]*", "");  
		//str=str.replaceAll("\\W", " ")    //we can also use this regular expression  
		System.out.println(str);  

	}

}
