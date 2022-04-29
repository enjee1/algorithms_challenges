package com.company.arrays;

public class CaptureRook {

    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/rYD9NTBmNhaPM6wx2
     */

    public static boolean canCapture(String[] rookArray) {
        if (rookArray[0].substring(0,1).equals(rookArray[1].substring(0,1)) ||
            rookArray[0].substring(1,2).equals(rookArray[1].substring(1,2)))
        { return true; }
        else { return false; }
    }

    public static void main(String[] args) {
        String[] rooks1 = new String[] {"A8", "E8"};
        String[] rooks2 = new String[] {"A1", "B2"};
        String[] rooks3 = new String[] {"H4", "H3"};
        String[] rooks4 = new String[] {"F5", "C8"};


        System.out.println(CaptureRook.canCapture(rooks1));
        System.out.println(CaptureRook.canCapture(rooks2));
        System.out.println(CaptureRook.canCapture(rooks3));
        System.out.println(CaptureRook.canCapture(rooks4));
    }
}
