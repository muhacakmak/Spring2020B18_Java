package Repl_It.OPP;

import java.util.Arrays;

public class _RowSum {
    public static void main(String[] args) {

        int[][] a = {{1, 1, 2}, {3, 1, 2}, {3, 5, 3}, {0, 1, 2}};
        int[] sums = rowSums(a);
        for (int sum : sums) {
            System.out.println(sum);

        }


//        int arr[] = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                arr[i] += nums[i][j];
//
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));


//        int[] sums = rowSums(a);
//        for (int sum : sums)
//            System.out.println(sum);
//        //this should print 4 6 11 3
//        int sum=0;
//        int k=0;
//       int [] arr=new int[nums.length];
//        for (int[]each:nums) {
//
//
//
//            System.out.println(Arrays.toString(each));
//        }

    }

    public static int[] rowSums(int[][] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                arr[i] += nums[i][j];
            }
        }
        return arr;
    }
}



