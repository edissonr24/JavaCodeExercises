package org.example.JavaChallenges2024.p04_java_topics.equals_and_hashcode;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        // Creamos objetos Person
        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 25);
        Person person3 = new Person("John", 30);

        // Creamos un mapa (HashMap) para almacenar Person
        Map<Person, String> personMap = new HashMap<>();
        personMap.put(person1, "Person 1");

        // Intentamos obtener el valor asociado con person2 en el mapa
        String value = personMap.get(person2);

        // Imprimimos el valor
        System.out.println("Valor asociado con person2: " + value);

        // Intentamos obtener el valor asociado con person3 en el mapa
        String value3 = personMap.get(person3);

        // Imprimimos el valor
        System.out.println("Valor asociado con person3: " + value3);
    }
}
