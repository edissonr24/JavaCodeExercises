package org.example.udemy.collections;

public class ArrayIntroduction {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 14;

        int[] x = new int[1000];
        System.out.println("Name: " + x.getClass().getName());

        //Zero as size
        int[] y = new int[0];

        //character as size - ascci value for 'a' is 97
        int[] z = new int['a'];
        //allowed data types for an int array: byte,short,char and int

        //negative array size
        int[] p = new int[1];

        //size of an int array cannot be more than this:2147483647
        int[] q = new int[2147483647];
        //214748364*4 memory required to create this array.
    }
}
