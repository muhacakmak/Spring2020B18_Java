package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public static int[] sortDesending(int[] arr) {
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;
    }

    public static String Reverse(String str) { // can reverse a string and returns string
        String Reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }

        return Reverse;
    }
    // remove duplicate from string

    public static String removeDuplicate(String str) {
        String result = "";// A

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;
    }

    // Frequency of string
    public static int frequency(String str1, String str2) {
        int count = 0;
        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make that we are not counting the same index over again
        }
        return count;
    }

    public static String FrequencyOfChars(String str) {
        String nonDub = Library.removeDuplicate(str);
        String result = "";

        for (int i = 0; i < nonDub.length(); i++) {
            String ch = "" + nonDub.charAt(i);
            int num = Library.frequency(str, ch);
            result += ch + num;
        }
        return result;

    }

    public static String uniques(String str) {
        String result = "";
        // A
        for (int i = 0; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static int frequency(String str, char ch) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (char eachArr : arr) {

            if (eachArr == ch) {
                count++;
            }
        }
        return count;
    }

    public static int max(ArrayList <Integer> list) {
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maximum) {
                maximum = list.get(i);
            }
        }
        return maximum;
    }


    // merge two array and return third one


    // merge two array and return third one

    // max number from array

    // min number from array


}
