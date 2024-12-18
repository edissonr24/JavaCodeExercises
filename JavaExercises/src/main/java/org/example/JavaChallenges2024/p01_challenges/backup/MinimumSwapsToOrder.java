package org.example.JavaChallenges2024.p01_challenges.backup;

public class MinimumSwapsToOrder {

    public int getMinimumSwapsToOrder(int[] arrayInt) {

        //{7, 1, 3, 2, 4, 5, 6}

        int c = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            int actual = arrayInt[i];
            if (actual == i+1) {
                continue;
            }
            int newPosition = arrayInt[actual-1];
            arrayInt[actual-1] = actual;
            arrayInt[i] = newPosition;
            c++;
        }

        for (int a: arrayInt) {
            System.out.println("Valor actual: " + a);
        }

        return c;
    }
}
