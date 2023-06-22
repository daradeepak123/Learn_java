package mapLearn;

import java.util.HashMap;
import java.util.Map;

public class MapLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "Ram");
		
		
		for(Map.Entry ele:map.entrySet())
		{
			System.out.println(ele.getKey()+"   " + ele.getValue());
		}
		
		
		
	}

}
