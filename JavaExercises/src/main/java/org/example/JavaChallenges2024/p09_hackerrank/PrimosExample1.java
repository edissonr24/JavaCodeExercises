package org.example.JavaChallenges2024.p09_hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimosExample1 {
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while (sc.hasNext()){
            int n = sc.nextInt();
            Prime p = new Prime();
            //System.out.println(n);
            boolean isPrime = p.checkPrime(n);

            if (isPrime) {
                list.add(n);
            }

            if (++count==4){continue;}

            for (int c:list) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    static class Prime {

        public boolean checkPrime(int value) {
            if (value == 1) {
                return false;
            } else {
                for (int i=2; i<=value/2; i++) {
                    if (value%i == 0) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

}