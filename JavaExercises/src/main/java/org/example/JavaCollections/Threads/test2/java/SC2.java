package org.example.SimpleExamples.Threads.test2.java;

public class SC2 {
	 public static void main(String [] args) 
    {
        SC2 s = new SC2();
        s.start();
    }

    void start() 
    {
        int a = 3;
        int b = 4;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(a + b);
        System.out.print(" " + a + b + " ");
        System.out.print(foo() + a + b + " ");
        System.out.println(a + b + foo());
        System.out.print(" "+ a + b);
    }

    String foo() 
    {
        return "foo";
    }
}
