package org.example.JavaChallenges2024.p06_patterns.PatronState.implementacion;

public class TestClientState { 
    public static void main(String[] args) { 
            StateContext sc = new StateContext(); 
            sc.writeName("Monday"); 
            sc.writeName("Tuesday"); 
            sc.writeName("Wednesday"); 
            sc.writeName("Thursday"); 
            sc.writeName("Saturday"); 
            sc.writeName("Sunday"); 
    }
}

