package com.company.arrays;



public class Boomerang {

    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/b7iHQDw72zzkmgCun
     */

    public static int countBoomerang(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length - 2 ; i++) {
            if (numbers[i] == numbers[i + 2] && numbers[i] != numbers[i + 1]){
                count++;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        int[] test1 = {9, 5, 9, 5, 1, 1, 1};
        int[] test2 = {5, 6, 6, 7, 6, 3, 9};
        int[] test3 = {4, 4, 4, 9, 9, 9, 9};

        System.out.println(countBoomerang(test1));
        System.out.println(countBoomerang(test2));
        System.out.println(countBoomerang(test3));
    }
}
