package org.example.SimpleExamples.java8;

class Test {

    // Constructor calling
    Test() {
        System.out.println("Constructor called");
    }

    // Case 1: Static variable
    static int i;
    // Case 2: Non-static variable
    int j;

    {
        System.out.println("Other called part 1");
    }

    // Case 3: Static blocks
    static {
        i = 10;
        System.out.println("static block called ");
    }

    {
        System.out.println("Other called part 2");
    }

    {
        System.out.println("Other called part 3");
    }
}

// Class 2
// Main class
class GFG {

    // Main driver method
    public static void main(String args[]) {

        // Although we have two objects, static block is
        // executed only once.
        Test t1 = new Test();
        Test t2 = new Test();
    }
}

