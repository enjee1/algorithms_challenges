package com.company.arrays;

import java.util.Arrays;

public class MaxMinDiff {
    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/hymPkXdhmDQLe87QT
     */

    public static int findMaxMinDiff(int[] numArr){
        int difference;

        Arrays.sort(numArr);
        int smallest = numArr[0];
        int largest = numArr[numArr.length - 1];

        difference = largest - smallest;
        return difference;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {10, 4, 1, 4, -10, -50, 32, 21};
        int[] arr2 = new int[] {44, 32, 86, 19};
        System.out.println(findMaxMinDiff(arr1));
        System.out.println(findMaxMinDiff(arr2));

    }
}
