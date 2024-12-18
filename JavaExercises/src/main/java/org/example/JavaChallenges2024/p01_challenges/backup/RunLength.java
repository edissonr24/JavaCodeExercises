package org.example.JavaChallenges2024.p01_challenges.backup;

/**
 * Given string S consisting of N letters 'a' or 'b'. This should return true if all occurrences of 'a'
 * are before all occurrences of 'b' and return false otherwise.
 * 'b' does not need to occur in S and 'a' does not need to occur in S
 */
public class RunLength {

    public static String runLengthEncoding(String word) {

        StringBuilder result = new StringBuilder("");
        int count = 1;
        char currentChar = word.charAt(0);
        for (int i = 0; i < word.length()- 1; i++ ) {
            char nextChar = word.charAt(i+1);
            // If the current character is equal to the next then I increase the counter
            if (currentChar == nextChar) {
                count++;
            } else {
                // If they are not equal, I add it to the result if it is greater than 1 and continue with the next character
                result.append(count > 1? count:"").append(currentChar);
                currentChar = nextChar;
                count = 1;
            }
        }
        result.append(count > 1? count:"").append(currentChar);
        return result.toString();
    }
}
