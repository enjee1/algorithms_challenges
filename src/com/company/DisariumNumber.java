package com.company;

public class DisariumNumber {

    /* This class fulfills the requirements for the challenge in the link below
       https://edabit.com/challenge/GjCgCugvh4eorPmgM
     */

    public static boolean isDisarium(int num) {

        String[] numArr = Integer.toString(num).split("");

        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            int singleDigit = Integer.parseInt(numArr[i]);
            sum += Math.pow(singleDigit, i + 1);
        }

        if (sum == num){
            return true;
        } else { return false; }


    }

    public static void main(String[] args) {
        int[] testNums = new int[] {75, 135, 518, 544, 8, 466};

        for (int num: testNums) {
            System.out.println(DisariumNumber.isDisarium(num));
        }

    }
}
