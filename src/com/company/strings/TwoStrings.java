package com.company.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TwoStrings {

    /* This class fulfills the requirements for the challenge in the link below
        https://www.hackerrank.com/challenges/two-strings/problem
     */


    public static String twoStrings(String s1, String s2) {
        String result = "NO";
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        char[] arr1 = s1.toLowerCase().trim().toCharArray();
        char[] arr2 = s2.toLowerCase().trim().toCharArray();
        for(char c : arr1) {
            charMap.put(c, 1);
        }

        for (char c : arr2) {
             if (charMap.containsKey(c)) {
                 result = "YES";
                 break;
             }
        }

        return result;
    }



}


