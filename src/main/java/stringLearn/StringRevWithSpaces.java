package stringLearn;

public class StringRevWithSpaces {
	
	public static String reverseStringWithSpaces(String str) {
	    char[] original = str.toCharArray();
	    char[] reversed = new char[original.length];

	    for (int i = original.length - 1, j = 0; i >= 0; i--) {
	        if (original[i] != ' ') {
	            reversed[j++] = original[i];
	        }
	    }

	    for (int i = 0; i < original.length; i++) {
	        if (original[i] == ' ') {
	            reversed[i] = ' ';
	        }
	    }

	    return new String(reversed);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(reverseStringWithSpaces("Hello Java Learn fast"));
		

	}

}
