package org.example.SimpleExamples.Collections.Ej03_Map;

import java.util.HashMap;

public class Ej03_HashMapExample {

	public static void main(String args[]) {  
		   
	    // create and populate hash map  
	    HashMap<Integer, String> map = new HashMap<Integer, String>(); 
	   
	    map.put(101,"Let us C");  
	    map.put(102, "Operating System");  
	    map.put(103, "Data Communication and Networking");  
	    map.put(100, "Let us Java");
	    System.out.println("Values before remove: "+ map);    
	   
	    // Remove value for key 102  
	    map.remove(102);  
	   	System.out.println("Values after remove: "+ map);  
	}     
	
}
