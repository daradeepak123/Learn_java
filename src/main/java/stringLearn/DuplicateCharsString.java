package stringLearn;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateCharsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String str = "hello world";
		char[] arr = str.toCharArray();

		HashSet<Character> set = new HashSet<>();
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : arr) {
		    if (set.contains(c)) {
		        int count = map.get(c);
		        map.put(c, count + 1);
		    } else {
		        set.add(c);
		        map.put(c, 1);
		    }
		}

		for (Character c : map.keySet()) {
		    int count = map.get(c);
		    if (count > 1) {
		        System.out.println("Character '" + c + "' occurs " + count + " times.");
		    }
		}


	}

}
