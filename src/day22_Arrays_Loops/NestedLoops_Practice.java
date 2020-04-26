package day22_Arrays_Loops;

import java.util.Arrays;

public class NestedLoops_Practice{


    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };

        System.out.println(Arrays.deepToString(numbers));

        // print all even numbers in same line
        // count odd number ==> return the total odd number


//        for (int i = 0; i <numbers.length ; i++) {
//            int [] arr=numbers[i];
//           for (int eachNumber:arr){
//               if(eachNumber%2!=0){
//                   continue;
//               }
//               System.out.print(eachNumber+" ");
//           }

     //   }

int count=0;
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i <numbers[j].length ; i++) {
                int num=numbers[j][i];
                if(num%2==0){
                    System.out.print(num+" ");
                }else{
                    count++;
                }
            }

        }
        System.out.println();
        System.out.println(count);






    }
}
