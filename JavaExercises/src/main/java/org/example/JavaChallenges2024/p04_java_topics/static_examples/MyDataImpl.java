package org.example.JavaChallenges2024.p04_java_topics.static_examples;

public class MyDataImpl implements MyData {

    public boolean isNull(String str) {
        System.out.println("Impl Null Check");

        return str == null ? true : false;
    }

    public static void main(String args[]){
        MyDataImpl obj = new MyDataImpl();
        obj.print("");                       // Ejecuta el print y el isNull de la interfaz
        obj.isNull("abc");               // Ejecuta el isNull de la clase
    }
}
