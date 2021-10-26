package com.company;


public class ReverseTheNumber {
     /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/tiyPFonvAJ8e6H9jS
     */

    public int reverseNum(int input) {
        int reversedNum = 0;

        for(;input != 0; input /= 10) {
            int i = input % 10;
            reversedNum = reversedNum * 10 + i;
        }
        
        return reversedNum;
    }


    public static void main(String[] args) {
        ReverseTheNumber revNum = new ReverseTheNumber();
        System.out.println(revNum.reverseNum(5121));
        System.out.println(revNum.reverseNum(69));
        System.out.println(revNum.reverseNum(-122157));
    }
}
