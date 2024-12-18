package org.example.JavaChallenges2024.p03_collections.Ej02_List;

import java.util.*;

public class Ej02_ListExample {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("Uno", "Dos", "Tres");
		for (String s: myList) {
			System.out.println(s);
		}

		List listA = new ArrayList();

		listA.add("element 0");
		listA.add("element 2");
		listA.add("element 1");
		listA.remove("element 2");

		//access via index
		String element0 = (String) listA.get(0);
		String element1 = (String) listA.get(1);
		String element3 = (String) listA.get(2);


		//access via Iterator
		Iterator iterator = listA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println("Iterador: " + element);
		}

		Collections.sort(listA);

		//access via new for-loop
		for(Object object : listA) {
		    String element = (String) object;
		    System.out.println("For-loop: " + element);
		}

		//***************************************************************
		// Create an ArrayList of strings
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("banana"); // Adding another "banana" for demonstration

		// Print the list before removal
		System.out.println("List before removal: " + list);

		// Remove a specific value from the list
		boolean removed = list.remove("banana");

		// Check if the value was removed successfully
		if (removed) {
			System.out.println("Value 'banana' removed successfully.");
		} else {
			System.out.println("Value 'banana' not found in the list.");
		}

		// Print the list after removal
		System.out.println("List after removal: " + list);
	}
	
}
