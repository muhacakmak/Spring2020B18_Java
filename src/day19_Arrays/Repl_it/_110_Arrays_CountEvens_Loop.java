package day19_Arrays.Repl_it;

import java.util.Scanner;

public class _110_Arrays_CountEvens_Loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        //            0 1 2 3 4
        int[] nums = {2,2,0,3,5};// 3
        int count=0;

        for (int eachNumber:nums) {

            if(eachNumber%2==0){
                count++;//1+1+1
            }


        }
        System.out.println(count);




    }
}
