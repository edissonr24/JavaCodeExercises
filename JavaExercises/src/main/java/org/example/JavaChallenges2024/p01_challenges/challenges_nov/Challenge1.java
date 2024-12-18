package org.example.JavaChallenges2024.p01_challenges.challenges_nov;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Challenge1 {


    public static void main(String[] args) {

        //List<Integer> myList = Arrays.asList(-4, 3, -9, 0, 4, 1);
        //List<Integer> myList = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);
        //List<Integer> myList = Arrays.asList(942381765, 627450398, 954173620, 583762094, 236817490);
        //List<Integer> myList = Arrays.asList(4, 3, 1, 0, 4, 1);
        //int total = simpleArraySum(myList);
        //System.out.println(total);

        //plusMinus(myList);
        //staircase(6);
        //miniMaxSum(myList);
        //System.out.println(countingSort(myList));
        //String result = caesarCipher("159357lcfd", 98);
        //System.out.println(result);

        //List<Integer> myList = Arrays.asList(-4, 3, -9, 0, 4, 1);
        List<Integer> myList = Arrays.asList(73, 67, 38, 33);

        gradingStudents(myList);
    }

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        /*for (int a:ar) {
            sum += a;
        }*/

        sum = ar.stream().mapToInt(Integer::intValue).sum();

        return sum;
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int size = a.size();
        int pointsA = 0;
        int pointsB = 0;
        for (int i=0; i < size; i++) {
            if (a.get(i) > b.get(i)) {
                pointsA++;
            }
            if (b.get(i) > a.get(i)) {
                pointsB++;
            }
        }
        return Arrays.asList(pointsA, pointsB);
    }


    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for (long number: ar) {
            sum += number;
        }
        return sum;

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1 = 0;

        for (int i = 0; i < arr.get(0).size(); i++) {
            sum1 += arr.get(i).get(i);
        }

        int sum2 = 0;
        for (int j = 0; j < arr.get(0).size(); j++) {
            int k = arr.get(0).size() - 1 - j;
            sum2 += arr.get(j).get(k);
        }

        return Math.abs(sum1 - sum2);

    }

    public static void plusMinus(List<Integer> arr) {

        int size = arr.size();
        double positive = 0;
        double negative = 0;
        double zero = 0;

        // Normal
        /*for(int c : arr) {
            if (c > 0) {
                positive++;
            } else if (c < 0) {
                negative++;
            } else {
                zero++;
            }

        }*/


        // Switch
        /*for(Integer num:arr) {
            switch (num.compareTo(0)) {
                case 1 :
                    positive++;
                    break;
                case -1:
                    negative++;
                    break;
                case 0:
                    zero++;
                    break;
            }
        }*/

        //Stream
        positive = arr.stream().filter(c -> c > 0).count();
        negative = arr.stream().filter(c -> c < 0).count();
        zero = arr.stream().filter(c -> c == 0).count();

        System.out.printf("%.6f", positive/size);
        System.out.printf("%n%.6f", negative/size);
        System.out.printf("%n%.6f", zero/size);

    }


    public static void staircase(int n) {
        // Write your code here
        StringBuilder line;
        for (int i = n; i > 0; i--) {
            line = new StringBuilder();
            for (int j = 1; j <= n; j++) {
                // Spaces will be n - i
                if (j < i) {
                    line.append(" ");
                } else {
                    line.append("#");
                }
            }
            System.out.println(line);
        }

        /*for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "#".repeat(i));
        }*/
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long sumTotal = arr.stream().mapToLong(Integer::intValue).sum();
        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;
        for (Integer num : arr) {
            long actual = sumTotal - num;
            minSum = actual < minSum?actual:minSum;
            maxSum = actual > maxSum?actual:maxSum;
        }
        System.out.println(minSum + " " + maxSum);

        //-2008291003 2063136757
        // 2063136757 2744467344

    }

    public static String timeConversion(String s) {
        // Write your code here
        DateTimeFormatter formatter12Hour = DateTimeFormatter.ofPattern("hh:mm:ssa");  // Formato de 12 horas
        DateTimeFormatter formatter24Hour = DateTimeFormatter.ofPattern("HH:mm:ss");   // Formato de 24 horas

        // Convertir la hora a formato de 24 horas
        LocalTime time = LocalTime.parse(s, formatter12Hour);
        String time24Hour = time.format(formatter24Hour);

        return time24Hour;
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int lonelyValue = 0;
        Map<Integer, Integer> countingMap = new HashMap<>();
        for(Integer c:a) {
            int total = countingMap.getOrDefault(c, 0);
            countingMap.put(c, ++total);
        }
        for (Map.Entry entry: countingMap.entrySet()) {
            if (entry.getValue().equals(1)) {
                lonelyValue = (int) entry.getKey();
            }
        }

        return lonelyValue;

    }

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int frecuency = Collections.frequency(arr, i);
            resultList.add(frecuency);
        }
        return resultList;
    }


    public static String caesarCipher(String s, int k) {
        // Write your code here
        char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        Map<Integer, Character> keyMap = new HashMap<>();

        int index = 1;
        for (char c:abc) {
            charMap.put(c, index);
            keyMap.put(index, c);
            index++;
        }

        StringBuilder result = new StringBuilder();
        for (Character t : s.toCharArray()) {
            int actualIndex = charMap.getOrDefault(Character.toLowerCase(t), 0);

            Character newValue = t;
            if (actualIndex > 0) {
                int newIndex = actualIndex + k;
                if (newIndex > abc.length) {
                    newIndex = newIndex % abc.length > 0? newIndex % abc.length : 26;
                }
                newValue = keyMap.get(newIndex);
            }
            if (Character.isUpperCase(t)) {
                newValue = Character.toUpperCase(newValue);
            }
            result.append(newValue);
        }
        return result.toString();
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        Collections.sort(candles, Comparator.reverseOrder());
        candles.stream().sorted().forEach(System.out::println);

        int biggest = candles.get(0).intValue();
        int count = (int) candles.stream().filter(c-> c.equals(biggest)).count();

        return count;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for(int c : grades) {

            int newValue = c;
            if (c >= 38) {
                int dif = 5 - (c % 5);
                if (dif < 3) {
                    newValue = c+dif;
                }
            }
            result.add(newValue);

        }
        return result;
    }



   /* List<Integer>myList = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
        int frequency = Collections.frequency(arr, i);
        myList.add(frequency);
    }
    return myList;*/
}
