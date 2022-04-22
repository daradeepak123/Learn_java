import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class Learn_Iteratios1 {
	
	
	
	@Test()
	public void Iteratevalues()
	{
		// Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    // Get the iterator
	    Iterator<String> it = cars.iterator();

	    // Print the first item
	    System.out.println(it.next());
	    
	    while(it.hasNext()) {
	    	  System.out.println(it.next());
	    	}
	    
	    
	    ArrayList AL=new ArrayList<String>();
	    AL.add("hello");
	    AL.add("Hi");
	    AL.add("GM");
	    AL.add("GN");
	    AL.add("Wasap");
	    
	    Iterator<String> val=AL.iterator();
	    System.out.println(AL.size());
	    
	    
	    while(val.hasNext())
	    {
	    	System.out.println(val.next());
	    }
	    
	    

}
}
