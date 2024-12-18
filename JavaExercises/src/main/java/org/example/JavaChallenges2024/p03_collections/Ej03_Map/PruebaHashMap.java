package org.example.JavaChallenges2024.p03_collections.Ej03_Map;

import java.util.HashMap;


public class PruebaHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Map<Integer,String> mapa = new HashMap<Integer,String>();
//		
//		mapa.put(1, "Victor");
//		mapa.put(2,  "Nacho");
//		mapa.put(3, "Julio");
//		mapa.put(4, "David");
//		mapa.put(1, "Pepe");
//		
//		String[] nombres = mapa.values().toArray(new String[0]);
//		
//		for (String nombre: nombres)
//			  System.out.println(nombre);
//		
//		Integer[] claves = mapa.keySet().toArray(new Integer[0]);
//		 
//		for (Integer clave: claves)
//		  System.out.println(clave);
//		
		
		HashMap<Integer,String> mapa = new HashMap<Integer,String>();
		
		mapa.put(1, "Victor");
		mapa.put(2,  "Nacho");
		mapa.put(3, "Julio");
		mapa.put(4, "David");
		mapa.put(1, "Pepe");
		
		// 
		for (Integer key: mapa.keySet()) {
			System.out.println(key + " = " + mapa.get(key));
		}
		System.out.println("-------------------------");
		
		//entryKey
		mapa.entrySet().forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
		System.out.println("-------------------------");
		
		String[] nombres = mapa.values().toArray(new String[0]);
		
		for (String nombre: nombres)
			  System.out.println(nombre);
		
		Integer[] claves = mapa.keySet().toArray(new Integer[0]);
		 
		// For
		for (Integer clave: claves)
		  System.out.println(clave);
	}

}
