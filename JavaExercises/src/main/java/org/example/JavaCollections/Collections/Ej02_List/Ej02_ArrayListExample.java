package org.example.SimpleExamples.Collections.Ej02_List;

import java.util.ArrayList;
import java.util.List;

public class Ej02_ArrayListExample {
	
	public static void main(String[] args) {
	      /*Creation of ArrayList: I'm going to add String
	       *elements so I made it of string type */
		  List<String> obj = new ArrayList<String>();

		  /*This is how elements should be added to the array list*/
		  obj.add("Ajeet");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");

		  /* Displaying array list elements */
		  System.out.println("Currently the array list has following elements:"+obj);

		  /*Add element at the given index*/
		  obj.add(0, "Rahul");
		  obj.add(1, "Justin");

		  /*Remove elements from array list like this*/
		  obj.remove("Chaitanya");
		  obj.remove("Harry");

		  System.out.println("Current array list is:"+obj);

		  /*Remove element from the given index*/
		  obj.remove(2);

		  System.out.println("Current array list is:"+obj);
	   }
}
