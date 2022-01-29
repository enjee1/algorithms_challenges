package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DaysBetween {
    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/3hdXjfJozQySRC3gE
     */

    public static int getDays(Date day1, Date day2){
        long timeDiff;
        Calendar date1 = new GregorianCalendar();
        Calendar date2 = new GregorianCalendar();
        date1.setTime(day1);
        date2.setTime(day2);


        if (date1.before(date2)) {
            timeDiff = ((date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000 / 60 / 60 / 24);

        } else if (date1.after(date2)) {
            timeDiff = ((date1.getTimeInMillis() - date2.getTimeInMillis()) / 1000 / 60 / 60 / 24);
        } else {
            timeDiff = 0;
        }


        return (int) timeDiff;
    }

    public static void main(String[] args) {
        String dateString1 = "June 14, 2019";
        String dateString2 = "June 20, 2019";
        String dateString3 = "December 29, 2018";
        String dateString4 = "January 1, 2019";
        String dateString5 = "July 20, 2019";
        String dateString6 = "July 30, 2019";

        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);

        try {
            Date date1 = formatter.parse(dateString1);
            Date date2 = formatter.parse(dateString2);
            Date date3 = formatter.parse(dateString3);
            Date date4 = formatter.parse(dateString4);
            Date date5 = formatter.parse(dateString5);
            Date date6 = formatter.parse(dateString6);
            System.out.println(getDays(date1, date2));
            System.out.println(getDays(date3, date4));
            System.out.println(getDays(date5, date6));
        } catch (ParseException exc) {
            System.out.println("Invalid date format.");
        }
    }
}
