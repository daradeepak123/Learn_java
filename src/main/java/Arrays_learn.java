import java.util.ArrayList;

import Access_modifiers_learn.Access_2;

public class Arrays_learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int ar[]= {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		String str[]= {"name","name1","name2","name3","name4","name5"};
		
		for (int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		short srt[]= {20,30,40,50,60};
		for (int i=0;i<srt.length;i++)
		{
			
			System.out.println(srt[i]);
		}
		
		
		
		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	      //Printing the arraylist object 
	      
	      for (String st: list)
	      {
	      System.out.println(st); 
	      }
		
	       	  

	}

}
