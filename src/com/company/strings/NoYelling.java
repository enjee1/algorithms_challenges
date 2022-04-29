package com.company.strings;

import java.util.ArrayList;

public class NoYelling {
    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/33tRK98geLPcf73PF
     */


    public static String noYelling(String sentence) {

        while(sentence.endsWith("!!") || sentence.endsWith("??")) {
            sentence = sentence.substring(0, sentence.length() - 1);
            sentence = noYelling(sentence);
        }

        return sentence;
    }
    public static void main(String[] args) {
        System.out.println(noYelling("What went wrong?????????"));
        System.out.println(noYelling("Oh my goodness!!!"));
        System.out.println(noYelling("I just!!! can!!! not!!! believe!!! it!!!"));
        System.out.println(noYelling("Oh my goodness!"));
        System.out.println(noYelling("I just cannot believe it."));
    }

}
