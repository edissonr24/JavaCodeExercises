package org.example.JavaChallenges2024.p01_challenges;

//import com.sun.deploy.util.StringUtils;

/**
 Palindrome: a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.
 */
public class LargestPalindromicNumber {

    public String getLargestPalindromicNumber(String stringNumber) {

        String largest = stringNumber.substring(1,2);

        for (int i = 0; i < stringNumber.length(); i++) {
            for (int j = i+1; j <= stringNumber.length(); j++) {
                String palindrom = stringNumber.substring(i, j);
                //if (isPalindromic(new StringBuilder(palindrom)) && palindrom.length() > largest.length()) {
                if (isPalindromic(new StringBuilder(palindrom)) && Integer.parseInt(palindrom) > Integer.parseInt(largest)) {
                    largest = palindrom;
                }

            }
        }
        return largest;
    }

    private boolean isPalindromic(StringBuilder word) {
        System.out.println(word);
        String original = word.toString();
        StringBuilder reversed = word.reverse();
        if (original.equalsIgnoreCase(reversed.toString())) {
            return true;
        }
        return false;
    }


}
