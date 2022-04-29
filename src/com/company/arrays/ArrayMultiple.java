package com.company.arrays;

import java.util.Arrays;

public class ArrayMultiple {

    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/rzpucPyoyEtXPo2BG
     */

    public int[] arrayOfMultiples(int num, int length) {
        int[] multiplesArray = new int[length];

        for (int i = 0; i < multiplesArray.length; i++){
            multiplesArray[i] = (num * (i + 1));
        }

        return multiplesArray;
    }

    public static void main(String[] args) {
        ArrayMultiple arrayMultiple = new ArrayMultiple();
        System.out.println(Arrays
                .toString(arrayMultiple
                .arrayOfMultiples(7, 5)));
        System.out.println(Arrays
                .toString(arrayMultiple
                .arrayOfMultiples(12, 10)));
        System.out.println(Arrays
                .toString(arrayMultiple
                .arrayOfMultiples(17, 6)));



    }
}
