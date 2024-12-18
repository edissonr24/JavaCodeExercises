package org.example.JavaChallenges2024.p07_interviews;

//import com.sun.deploy.util.StringUtils;

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
public class CgiExercise {

    public static void main(String[] args) {

        //int[] arrayNum = {2, 4, 5, 1, 6, 3, 9, 7, 8, 0};
        int[] arrayNum = {2, 4, 5, 1, 6, 3, 9, 0, 8, 7};
        int[] arrayOrdenado = ordenarArray(arrayNum);
        for (int c:arrayNum) {
            System.out.print(c + " ");
        }

        System.out.println("Factorial: " + factorial(5));

        /*//System.out.println("Nueva linea");
        //System.out.print("Nueva linea2");
        System.out.printf("Nueva linea3");
        String a = "Hola;Bienvenido;A;La;Aplicacion";
        String[] res = a.split("\\;");
        String[] res2 = StringUtils.splitString(a, "\\;");
        System.out.println("Size: " + res.length);
        System.out.println("Size: " + res2.length);
        List<String> b = new ArrayList();
        b.size();*/
    }

    private static int[] ordenarArray(int[] arrayNum) {
        int last = arrayNum.length;
        for(int i = last; i > 1; i--) {
            boolean interchange = false;
            for(int j=0; j < last-1; j++) {
                if (arrayNum[j] > arrayNum[j+1]) {
                    int aux = arrayNum[j];
                    arrayNum[j] = arrayNum[j+1];
                    arrayNum[j+1] = aux;
                    interchange = true;
                }
            }
            if(!interchange) {
                break;
            }
        }
        return arrayNum;
    }

    private static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no se puede calcular para números negativos");
        }
        int fact = 0;
        if (n == 0 || n==1) {
            return 1;
        }
        fact = n * factorial(n-1);
        return fact;
    }
}
