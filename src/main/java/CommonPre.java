
public class CommonPre {
	
	
	public static String findCommonPrefix(String[] strs) {
	    if (strs == null || strs.length == 0) {
	        return "";
	    }

	    String prefix = strs[0]; // Initialize the prefix with the first string in the array

	    for (int i = 1; i < strs.length; i++) {
	        while (!strs[i].startsWith(prefix)) {
	            // Reduce the prefix by one character at a time until it is a prefix of the current string
	            prefix = prefix.substring(0, prefix.length() - 1);

	            if (prefix.isEmpty()) {
	                // If the prefix becomes empty, there are no common prefixes
	                return "";
	            }
	        }
	    }

	    return prefix;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"apple", "app", "application"};
		String commonPrefix = findCommonPrefix(strs);
		System.out.println("Common Prefix: " + commonPrefix);


	}

}
