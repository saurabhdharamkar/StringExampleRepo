package com.neo;

import java.util.Arrays;

public class ShortCommonSuper {
	

    public static int shortCommonSuper(String X, String Y) {
        int m = X.length();
        int n = Y.length();

       
        String combined = X + Y;


        char[] sortedChars = combined.toCharArray();
        Arrays.sort(sortedChars);

        
        int uniqueChars = 0;
        for (int i = 1; i < sortedChars.length; i++) {
            if (sortedChars[i] != sortedChars[uniqueChars]) {
                uniqueChars++;
                sortedChars[uniqueChars] = sortedChars[i];
            }
        }

     
        return uniqueChars + 1;
    }

    public static void main(String[] args) {
        
        String X = "abcd";
        String Y = "xycd";
        int result = shortCommonSuper(X, Y);
        System.out.println("Output: " + result);
    }
}
