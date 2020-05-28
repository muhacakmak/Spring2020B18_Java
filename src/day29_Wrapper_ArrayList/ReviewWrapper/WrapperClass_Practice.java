package day29_Wrapper_ArrayList.ReviewWrapper;

import java.util.Arrays;

public class WrapperClass_Practice {
    /*
    iven:
	String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	find thhe maximum and minimum numbers
		NOTE: Do not use sort method
     */
    public static void main(String[] args) {

        String[] arr = {"1", "2.5", "3", "3.5", "4.5"};
        double max = Integer.MIN_VALUE;
        double[] arrD = new double[arr.length];
        System.out.println("regular loop ==========================");
        for (int i = 0; i < arrD.length; i++) {
            arrD[i] = Double.parseDouble(arr[i]);
            if (arrD[i] > max) {
                max = arrD[i];
            }
        }
        System.out.println("Seljuk number: " + max);

        System.out.println("each loop ============================");
        for (String each : arr) {
            double num = Double.parseDouble(each);
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Seljuk number: " + max);

        System.out.println("short ============================");
        double[] numbers = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Double.parseDouble(arr[i]);
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Seljuk number: " + numbers[numbers.length - 1]);
    }
}
