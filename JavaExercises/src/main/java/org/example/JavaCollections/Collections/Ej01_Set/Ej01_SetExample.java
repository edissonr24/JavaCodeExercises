package org.example.SimpleExamples.Collections.Ej01_Set;

import java.util.*;

public class Ej01_SetExample {
	
	public static void main(String[] args){
		Set<String> setA = new HashSet<String>();

		setA.add("element 0");
		setA.add("element 3");
		setA.add("element 4");
		setA.add("element 1");
		setA.add("element 1");
		
		//access via Iterator		
		Iterator<String> iterator = setA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println("Elemento con iterador: " + element);
		}


		//access via new for-loop
		for(String object : setA) {
		    //String element = (String) object;
		    System.out.println("Elemento con for: " + object);
		}

		System.out.println("---------------------------------------------");
		Set<String> linkedHash = new LinkedHashSet<>();
		linkedHash.add("Element 0");
		linkedHash.add("Element 3");
		linkedHash.add("Element 4");
		linkedHash.add("Element 1");

		for (String element : linkedHash){
			System.out.println("Elemento Actual linkedHash: " + element);
		}

		System.out.println("---------------------------------------------");
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Element 0");
		treeSet.add("Element 3");
		treeSet.add("Element 4");
		treeSet.add("Element 1");

		for (String element : treeSet){
			System.out.println("Elemento Actual treeSet: " + element);
		}
	}

	
	
	
}
