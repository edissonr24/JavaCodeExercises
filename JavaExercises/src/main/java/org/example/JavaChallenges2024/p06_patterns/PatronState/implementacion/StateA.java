package org.example.JavaChallenges2024.p06_patterns.PatronState.implementacion;

class StateA implements State { 
    public void writeName(StateContext stateContext, String name) { 
            System.out.println(name.toLowerCase()); 
            stateContext.setState(new StateB()); 
    } 
} 

