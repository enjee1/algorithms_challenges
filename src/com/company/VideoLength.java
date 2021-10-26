package com.company;

public class VideoLength {

    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/9D39q2q9yAFCDM9da
     */

    public int minutesToSeconds(String input) {
        String[] totalDuration = input.split(":");
        int durationInSeconds = 0;

        for (int i = 0; i < totalDuration.length; i++) {
            int time = Integer.parseInt(totalDuration[i]);

            if (i == 1) {
                if (time >= 60) durationInSeconds = -1;
                else durationInSeconds += time;

            } else durationInSeconds += time * 60;

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
