package org.example.JavaChallenges2024.p07_interviews;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * A1,2;B1,1;D1,=2*C3;E2,=D1*A5;C3,33;E4,45;A5,=B1*A1;D5,=A1
 *
 * Mapa valores
 * A1,2
 * B1,1
 * C3,33
 * E4,45 *
 *
 * Mapa de ecuaciones
 * D1,=2*C3
 * E2,=D1*A5
 * A5,=B1*A1
 * D5,=A1
 *
 * A1,2;       --> 2
 * B1,1;       --> 1
 * D1,=2*C3;   --> 66
 * E2,=D1*A5;  --> 132
 * C3,33;      --> 33
 * E4,45;      --> 45
 * A5,=B1*A1;  --> 2
 * D5,=A1      --> 2
 */
public class TwilioExerciseImprovement {

    static Map<String, Integer> calculateMap = new HashMap<>();
    static Map<String, String> equationsMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        input = in.nextLine();
        System.out.println(input);

        String[] values = StringUtils.split(input, ";");
        for(String c: values){
            System.out.println(c);

            // Split values with an equation and with a value
            if (!c.contains("=")) {
                String key = c.substring(0,2);
                int value = Integer.valueOf(c.substring(3, c.length()));
                calculateMap.put(key, value);

            } else  {
                String key2 = c.substring(0,2);
                String value2 = c.substring(4, c.length());
                equationsMap.put(key2, value2);
            }
        }
        for(Map.Entry<String, String> entry:equationsMap.entrySet()) {
            int result = calculateOperation(entry.getValue());
            calculateMap.put(entry.getKey(), result);
        }
        System.out.println("Calculate" + calculateMap);
        System.out.println("Equations:" + equationsMap);
    }

    private static int calculateOperation(String operation) {
        String[] operationResult = StringUtils.split(operation, "*");
        List<Integer> operationValues = new ArrayList<>();
        int x = 0;
        for(String text:operationResult){
            try {
                x = Integer.parseInt(text);
            } catch (NumberFormatException e) {
                if (calculateMap.containsKey(text)) {
                    x = calculateMap.get(text);
                } else {
                    String val = equationsMap.get(text);
                    x = calculateOperation(val);
                }
            }
            operationValues.add(x);
        }
        int result = operationValues.stream()
                .reduce(1, (a, b) -> a * b);
        return result;
    }

}
