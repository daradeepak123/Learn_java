package Collections_learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Array_list_learn {
	
	
	
	public static void hello()
	{
		int a,b,c;
		a=30;
		b=40;
		c=a+b;
		System.out.println("value of c is "+c);
		
		System.out.println("hello world");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> li=new ArrayList<Integer>();
	
	li.add(100);
	
	

		List<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay"); 
		
		list.remove(0);
		list.add("hello");
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		
		
		
	}

}
