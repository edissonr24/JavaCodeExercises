package org.example.JavaChallenges2024.p04_java_topics.static_examples;

public class MyDataImpl2 implements MyData2 {

    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }

    public static void main(String args[]){
        MyDataImpl2 obj = new MyDataImpl2();
        obj.print("");                // Ejecuta el print de la interfaz y el isNull de la clase sobreescribe el default de la clase
        obj.isNull("abc");         // Ejecuta el isNull de la clase
    }
}
