package org.example.JavaChallenges2024.p04_java_topics.static_block;

/**
 * Hello world!
 *
 */
public class GFG
{
    // Static Variable
    public static void main(String[] args) {
        System.out.println("Static Variable=" + count);
        System.out.println("Static Method");
    }
    // Static Variable
    static int count = 3;
    // Called even before Main Method
    static { System.out.println("Static Block"); }

}
