package Repl_It.Methods;

import java.util.Arrays;

public class _Assessment_test_3_3_Reverse_an_array {
    public static void main(String[] args) {
        String[] arr = {"apple", "pear"};

        System.out.println(Arrays.toString(reverse(arr)));
    }
    public static String[] reverse(String[] arr) {
        String[] reverse = new String[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[j] = arr[i];
            j++;
        }
        return reverse;
    }

}
