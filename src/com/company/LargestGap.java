package com.company;

import java.util.Arrays;

public class LargestGap {
    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/qSJ5hZfG52Nf2hXWS
     */

    public static int findLargestGap(int[] numArr) {
        Arrays.sort(numArr);
        int maxGap = 0;
        for (int i = numArr.length - 1; i > 0; i--) {
            int gapValue = numArr[i] - (numArr[i - 1]);
            if (gapValue > maxGap) { maxGap = gapValue; };
        }

        return maxGap;
    }


    public static void main(String[] args) {
    int[][] testNums = new int[][]
            {
                {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5},
                {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7},
                {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9}
            };

        for (int[] multiIntArr : testNums) {
            System.out.println(findLargestGap(multiIntArr));
        }
    }
}
