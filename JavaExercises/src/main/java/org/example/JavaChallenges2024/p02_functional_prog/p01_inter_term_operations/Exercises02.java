package org.example.JavaChallenges2024.p02_functional_prog.p01_inter_term_operations;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.*;
import java.util.stream.Collectors;

public class Exercises02 {
    public static void main(String[] args) {
        //int[] teamSize = {1, 2, 2, 3, 4};
        int[] teamSize = {1, 7, 3, 8};
        int k = 1;
        int result = maxUniformTeams(teamSize, k);
        System.out.println("El número máximo de equipos de igual tamaño que pueden ser formados es: " + result);
    }

    public static int maxUniformTeams(int[] teamSize, int k) {
        // Conteo de equipos por tamaño
        Map<Integer, Integer> sizeCount = new HashMap<>();
        for (int size : teamSize) {
            sizeCount.put(size, sizeCount.getOrDefault(size, 0) + 1);
        }

        // Encontrar el tamaño de equipo más común y sumar equipos reducidos
        int maxTeams = 0;
        for (Map.Entry<Integer, Integer> entry : sizeCount.entrySet()) {
            int size = entry.getKey();
            int count = entry.getValue();

            // Clonar el mapa para modificarlo temporalmente
            Map<Integer, Integer> tempSizeCount = new HashMap<>(sizeCount);
            int tempK = k;

            // Reducir otros tamaños al tamaño actual
            for (int otherSize : tempSizeCount.keySet()) {
                if (otherSize != size && tempK > 0) {
                    int reducibleCount = tempSizeCount.get(otherSize);
                    int reduceAmount = Math.min(reducibleCount, tempK);
                    count += reduceAmount;
                    tempK -= reduceAmount;
                }
            }

            maxTeams = Math.max(maxTeams, count);
        }

        return maxTeams;
    }
}

