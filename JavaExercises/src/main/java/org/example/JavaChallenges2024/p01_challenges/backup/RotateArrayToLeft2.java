package org.example.JavaChallenges2024.p01_challenges.backup;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
imports for BufferedReader*/

//import for Scanner and other utility classes

import java.util.Scanner;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class RotateArrayToLeft2 {
    public static void main(String args[] ) throws Exception {
        // Sample code to perform I/O:
        // Use either of these methods for input

        //BufferedReader
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");*/    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();


        // Write your code here
        for (int c = 0; c < testCases; c++) {
            int size = s.nextInt();
            int steps = s.nextInt();
            steps = steps % size;
            int[] arrayValues = new int[size];
            for (int i = 0; i < size; i++) {
                arrayValues[i] = s.nextInt();
            }

            int[] result = new int[size];
            for (int j = 0; j < size; j++) {
                if (j + steps >= size) {
                    result[j+steps-size] = arrayValues[j];
                } else {
                    result[j+steps] = arrayValues[j];
                }
            }

            for (int num:result) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }

    }
}

