package Repl_It.ArrayList;

import java.util.Arrays;

public class _Assessment_test_4_1_is_sorted {
    public static void main(String[] args) {
        int []nums={1,3,4,2,9};
        System.out.println( isSort(nums));

    }
    public static boolean isSort(int[] nums) {
        int []sortNums=new int[nums.length];
        for (int i = 0; i <sortNums.length ; i++) {
            sortNums[i]=nums[i];
        }
        Arrays.sort(sortNums);
       return Arrays.equals(nums, sortNums);

    }
}
