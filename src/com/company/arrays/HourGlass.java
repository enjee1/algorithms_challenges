package com.company.arrays;

import java.util.List;

public class HourGlass {

    /* This class fulfills the requirements for the challenge in the link below
        https://www.hackerrank.com/challenges/2d-array/problem
     */


    public static int hourglassSum(List<List<Integer>> arr){
        int max = Integer.MIN_VALUE;
        int tempSum = 0;

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                tempSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) +
                                            + arr.get(i + 1).get(j + 1) +
                        arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if (tempSum > max) { max = tempSum; }
            }
        }
        return max;
    }

}
