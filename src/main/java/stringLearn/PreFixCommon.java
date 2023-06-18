package stringLearn;

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

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] strings = {"apple", "application", "aptitude"};
		String commonPrefix = findCommonPrefix(strings);
		System.out.println("Common prefix: " + commonPrefix);

	}

}
