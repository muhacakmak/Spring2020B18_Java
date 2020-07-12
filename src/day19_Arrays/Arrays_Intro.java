package day19_Arrays;

import java.util.Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        //              0    1  2   3   4     5
        int []arr=new int[3];
        arr[0]=12;
        arr[1]=15;
        arr[2]=20;

        int[] scores = {70, 75, 85, 90, 95, 100};

        scores[5]=90;
        System.out.println(Arrays.toString(scores));

//        int num1=scores[0];
//
//        System.out.println(num1);
//        int num2=scores[5];
//        System.out.println(num2);



    }
}
