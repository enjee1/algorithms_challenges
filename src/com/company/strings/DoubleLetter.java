package com.company.strings;

public class DoubleLetter {
    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/EaWY5d2pYBckrkAnS
     */

    public static boolean hasDoubleLetter(String word) {
        boolean hasDouble = false;

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) { hasDouble = true; }
        }

        return hasDouble;
    }

    public static void main(String[] args) {
        System.out.println(hasDoubleLetter("loop"));
        System.out.println(hasDoubleLetter("yummy"));
        System.out.println(hasDoubleLetter("orange"));
        System.out.println(hasDoubleLetter("munchkin"));
    }
}
