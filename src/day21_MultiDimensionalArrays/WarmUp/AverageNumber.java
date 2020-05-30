package day21_MultiDimensionalArrays.WarmUp;

public class AverageNumber {
    /*
    1. write a program that can return the average number from an array of integers
			Task.Pizza:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
     */
    public static void main(String[] args) {


        int [] arr={10,20,30,40,50,40};

        // average : sum of all numbers/ length

        int sum=0;
        double average=0;


        for (int i = 0; i <arr.length ; i++) {

            int eachNumbers=arr[i];
            sum+=eachNumbers;// sum+=
            average=(double)sum/arr.length;

        }
        System.out.println(sum);

        System.out.println(average);











    }
}
