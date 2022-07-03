package Collections_learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_list_learn {

	
	public static String str="";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 List<String> list = new ArrayList<>();
	      list.add("A");
	      list.add("B");
	      list.add("C");
	      list.add("D");
	      list.add("A");
	      list.add("B");
	      list.add("C");
	      list.add("D");
	      List<String> list1 = new LinkedList<>();
	      list1.add("A");
	      list1.add("B");
	      list1.add("C");
	      list1.add("D");
	      list1.add("A");
	      list1.add("B");
	      list1.add("C");
	      list1.add("D");
	      
	      list1.remove(0);
	      
	     
	      System.out.println("AL--->"+list);
	      
	      System.out.println("LL--->"+list1);
	      
	      for (String lst: list)
	      {
	    	  System.out.println(lst);
	    	  
	    	  if (lst=="C")
	    	  {
	    		  str=lst;
	    	  }
	    	  
	    	  
	      }
	      System.out.println("assigned value is---> "+str);
	      
	      
	      list1.add(2, str);
	      
	      list1.add(0,"hello");
	      
	      list1.remove(0);
	      System.out.println(list1);

	}

}
