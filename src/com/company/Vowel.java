package com.company;

import java.util.ArrayList;

public class Vowel {
    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/GBKphScsmDi9ek3ra
     */

    ArrayList<Character> vowels;
    {
        vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

    }

    public int countVowels (String input){
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.toLowerCase().charAt(i);
            if (vowels.contains(c)) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        Vowel vowels = new Vowel();
        System.out.println(vowels.countVowels("Celebration"));
        System.out.println(vowels.countVowels("Palm"));
        System.out.println(vowels.countVowels("Prediction"));
    }



}

