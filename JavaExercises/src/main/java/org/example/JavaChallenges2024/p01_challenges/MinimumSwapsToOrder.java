package org.example.JavaChallenges2024.p01_challenges;


/**
    //{7, 1, 3, 2, 4, 5, 6}

 */
public class MinimumSwapsToOrder {

    public int getMinimumSwapsToOrder(int[] arrayInt) {

        int c = 0;
        for(int i=0; i < arrayInt.length-1; i++) {
            if (arrayInt[i] != i+1) {
                int aux = arrayInt[i];
                arrayInt[i] = arrayInt[aux-1];
                arrayInt[aux-1] = aux;
                c++;

            }
            /*for(int j:arrayInt) {
                System.out.print(j + ",");
            }*/
        }
        return c;

    }

    /*public int getMinimumSwapsToOrder(int[] arrayInt) {
        int swaps = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            // Verificar si el elemento actual está en su posición correcta
            while (arrayInt[i] != i + 1) {
                int correctIndex = arrayInt[i] - 1;
                // Intercambiar el elemento actual con el que está en su posición correcta
                int temp = arrayInt[i];
                arrayInt[i] = arrayInt[correctIndex];
                arrayInt[correctIndex] = temp;
                swaps++;
            }
        }
        return swaps;
    }*/
}
