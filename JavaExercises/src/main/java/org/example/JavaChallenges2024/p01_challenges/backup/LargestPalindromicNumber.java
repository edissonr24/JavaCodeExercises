package org.example.JavaChallenges2024.p01_challenges.backup;

/**
 Palindrome: a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.
 */
public class LargestPalindromicNumber {

    public String getLargestPalindromicNumber(String stringNumber) {

       /* Map<Character, Integer> mapValues = new HashMap<>();
        for (int i = 0; i < stringNumber.length(); i++) {

            char c = stringNumber.charAt(i);
            if (mapValues.containsKey(c)) {
                mapValues.put(c, mapValues.get(c)+1);
            } else {
                mapValues.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: mapValues.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }*/


        String largestPalindromic = stringNumber.substring(0,1);
        for (int i = 0; i < stringNumber.length(); i++) {

            for (int j = i+1; j <= stringNumber.length(); j++) {
                String actual = stringNumber.substring(i,j);
                if (isPalindrome(actual) && Integer.parseInt(actual) > Integer.parseInt(largestPalindromic)) {
                    largestPalindromic = actual;
                }
            }
        }
        return largestPalindromic.toString();
    }


    private boolean isPalindrome(String text) {
        StringBuilder reversed = new StringBuilder(text).reverse();
        if (text.equalsIgnoreCase(reversed.toString())) {
            return true;
        }
        return false;
    }

}
