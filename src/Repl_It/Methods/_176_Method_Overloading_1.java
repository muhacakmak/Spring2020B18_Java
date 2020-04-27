package Repl_It.Methods;

public class _176_Method_Overloading_1 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 9};
        System.out.println( findMax(arr));
    }

    public static int findMax(int[] arr) {
        int maxNumber = arr[0];
        for (int value : arr) {
            if (value > maxNumber) {
                maxNumber = value;
            }
        }
        return maxNumber;
    }

    public static double findMax(double[] arr) {
        double maxNumber = arr[0];
        for (double v : arr) {
            if (v > maxNumber) {
                maxNumber = v;
            }
        }
        return maxNumber;
    }

}
