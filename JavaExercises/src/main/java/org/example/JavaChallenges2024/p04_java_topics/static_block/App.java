package org.example.JavaChallenges2024.p04_java_topics.static_block;

/**
 * Hello world!
 *
 */
public class App 
{
    App(int x) {
        System.out.println("One argument constructor");
    }

    App() {
        System.out.println("No argument constructor");
    }

    static {
        System.out.println("1st static");
    }

    {
        System.out.println("1st instance");
    }

    {
        System.out.println("2nd instance");
    }

    static {
        System.out.println("2nd static");
    }


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        new App();
        new App(10);

    }
}
