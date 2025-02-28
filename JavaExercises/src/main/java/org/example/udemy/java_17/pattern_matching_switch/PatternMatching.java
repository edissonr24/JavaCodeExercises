package org.example.udemy.java_17.pattern_matching_switch;

public class PatternMatching {
    public static void whatType(Object o){
        switch(o){
            case String s -> System.out.println("String");
            case Integer i -> System.out.println("Integer");
            case null -> System.out.println("Null");
            default -> System.out.println("Not recognised");
        }
    }
    public static void infoOnType(Object o){
        switch(o){
            case String s -> {
                if (s.startsWith("A")) {
                    System.out.println("String beginning with A: " + s);
                } else {
                    System.out.println("String: " + s);
                }
            }
            case Integer i -> {
                if (i > 10) {
                    System.out.println("Integer > 10: " + i);
                } else {
                    System.out.println("Integer: " + i);
                }
            }
            case null -> System.out.println("Null");
            default -> System.out.println("Not recognised");

            /*case String s && s.startsWith("A")-> System.out.println("String beginning with A : "+s);
            case Integer i && i.intValue() > 10 -> System.out.println("Integer > 10 : "+i);
            case null -> System.out.println("Null");
            default -> System.out.println("Not recognised");*/
        }
    }

    public static void main(String[] args) {
        whatType("ABC");
        whatType(122);
        whatType(null);
        whatType(32.39);// Double

        infoOnType("ABC");
        infoOnType("abc");
        infoOnType(12);
        infoOnType(8);
    }
}