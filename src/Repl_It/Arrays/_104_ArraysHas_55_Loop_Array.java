package Repl_It.Arrays;

import java.util.Scanner;

public class _104_ArraysHas_55_Loop_Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        String numberStr="";


        for (int i = 0; i < nums.length; i++) {
            numberStr+=""+nums[i];
            }

        if(numberStr.contains("55")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



        }
    }

