package org.example.JavaChallenges2024.p07_interviews;

public class CgiInterview {

    public int calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no se puede calcular para números negativos");
        }
        int fact = 0;
        if (n == 0 || n==1) {
            return 1;
        }
        fact = n * calcularFactorial(n-1);
        return fact;
    }
}
