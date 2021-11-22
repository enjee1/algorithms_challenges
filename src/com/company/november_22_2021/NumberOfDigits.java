package com.company.november_22_2021;

public class NumberOfDigits {

    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/z9ofdqhTYi9tdCj5T
     */

    public static int numOfDigits(int num) {
        int result = 0;
        result = Integer.toString(Math.abs(num)).length();

        return result;
    }

    public static void main(String[] args) {
        System.out.println(NumberOfDigits.numOfDigits(1000));
        System.out.println(NumberOfDigits.numOfDigits(12));
        System.out.println(NumberOfDigits.numOfDigits(1305981031));
        System.out.println(NumberOfDigits.numOfDigits(0));
    }
}
