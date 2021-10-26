package com.company;

public class VideoLength {

    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/9D39q2q9yAFCDM9da
     */

    public int minutesToSeconds(String input) {
        String[] totalDuration = input.split(":");
        int durationInSeconds = 0;

        for (int i = totalDuration.length - 1; i > 0; i--) {
            if (i == 1 && Integer.parseInt(totalDuration[i]) >= 60) {
                durationInSeconds = -1;
            }

        }
        return durationInSeconds;
    }

    public static void main (String[] args){
        VideoLength length = new VideoLength();
        System.out.println(length.minutesToSeconds("01:00"));
        System.out.println(length.minutesToSeconds("13:56"));
        System.out.println(length.minutesToSeconds("10:60"));

    }
}
