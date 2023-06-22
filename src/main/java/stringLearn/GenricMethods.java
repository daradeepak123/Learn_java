package stringLearn;

public class GenricMethods {
	
	
	
	public static <A> void hello(A s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		hello("hello");
		hello(300);
		

	}

}
