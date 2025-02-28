package org.example.udemy.java_11;

// 1. Apply directly.
// 2. Apply via inheritance.

import java.lang.annotation.Inherited;

//@interface BreatheInWater{}
@Inherited
@interface BreatheInWater{} // this is an inheritable annotation

@BreatheInWater class Fish{}

class Trout extends Fish{}

public class InheritedExample {

}
