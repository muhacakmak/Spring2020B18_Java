package Repl_It;


import java.time.LocalTime;


public class _1Time_Conversion {
    /*
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
     */
    public static void main(String[] args) {


        String s = "07:05:00AM";
        timeConversion(s);
    }
    public static void timeConversion(String s) {
        String time = s;
        String[] arr = time.substring(0, time.length() - 2).replaceAll(":", " ").split(" ");

        int[] numArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
        }
        int hour = numArr[0];
        int min = numArr[1];
        int second = numArr[2];
        if (s.contains("PM")) {
            if (second == 0) {
                LocalTime tm = LocalTime.of(hour + 12, min, second);
                System.out.println(tm + ":00");
            } else {
                LocalTime tm = LocalTime.of(hour + 12, min, second);
                System.out.println(tm);
            }
        } else {
            if (second == 0) {
                LocalTime tm = LocalTime.of(hour, min, second);
                System.out.println(tm + ":00");
            } else {
                LocalTime tm = LocalTime.of(hour, min, second);
                System.out.println(tm);
            }
        }

    }
}
