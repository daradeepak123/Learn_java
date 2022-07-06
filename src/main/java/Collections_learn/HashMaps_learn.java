package Collections_learn;

import java.util.HashMap;
import java.util.Map;

public class HashMaps_learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, Integer> map = new HashMap<>();
		 
        // Adding elements to the Map
        // using standard put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("vaibhav1", 20);
        map.put("vishal", 10);
 
        
        System.out.println("Size of map is:- "+ map.size());
 
        // Printing elements in object of Map
        System.out.println(map);
 
        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("vishal")) {
 
            // Mapping
            int a = map.get("vishal");
 
            
		
		
            
            
            
                   
            
            HashMap <Integer,String> map1=new HashMap<>();
            
            map1.put(1,"hello");
            map1.put(2,"hello");
            map1.put(20, "Not sure");
            
            System.out.println(map1);
		
		
        }	
		
		

	}

}
