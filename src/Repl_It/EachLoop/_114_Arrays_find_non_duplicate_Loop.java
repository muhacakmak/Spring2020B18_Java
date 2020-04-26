package Repl_It.EachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class _114_Arrays_find_non_duplicate_Loop {
    /*
    Given an array nums with 7 integers every element is repeated twice - except one.
     Find that element and print it to console.
    Example:
    nums -> [1, 1, 2, 3, 4, 3, 4]
             2
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        String result ="";

        for (int j = 0; j <nums.length; j++) {

            int count=0;
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == nums[j]) {
                    count++;
                }

            }
            if (count ==1) {
                result += ""+nums[j];

            }

        }
        System.out.println(result);

    }

    }

