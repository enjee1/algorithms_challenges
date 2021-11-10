package com.company;


import java.util.stream.Stream;

public class HighestDigit {

    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/9X8zLpBEcQsyerPgL
     */

    public static int findLargestDigit(int num) {
        return (num + "").chars().map(i -> Integer.parseInt((char)i + "")).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(findLargestDigit(4666));
        System.out.println(findLargestDigit(544));
        System.out.println(findLargestDigit(379));
        System.out.println(findLargestDigit(2));
        System.out.println(findLargestDigit(377401));
    }

}
