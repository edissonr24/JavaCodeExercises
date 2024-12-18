package org.example.JavaChallenges2024.p04_java_topics.static_block;

public class Calc {

    static int product(int x, int y) {
        return x * y;
    }

    private int sum(int a, int b) {
        return product(a,b);
    }

    public static void main(String[] args) {
        /*int ans = Calc.product(5, 3);*/
        String str = "";
        for (int i=0; i< args.length-1; i++) {
            str += args[i];
            System.out.println("str " + args[i]);
        }

        System.out.println(str);
    }
}
