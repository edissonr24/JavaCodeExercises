package org.example.JavaChallenges2024.p01_challenges;

public class StringIsRotationOfOther {

    public boolean string2IsRotationOfString1(String input1, String input2) {

        String inputConcat = input1==null?"": input1.concat(input1);
        String inputValue2 = input2==null?"": input2;

        /*if (inputConcat.contains(inputValue2)) {
            return true;
        }
        return false;*/
        return inputConcat.contains(inputValue2);
    }
}
