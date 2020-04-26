package Repl_It.Methods.VoidMethods;

public class _151_Methods_14_Print_unique_numbers {
    /*
    Write a void method printUniqueNumbers that will print unique numbers from an array of ints.
        Example:
        input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
        output:
        2
        9
        34
     */
    public static void main(String[] args) {
        int nums[] = {2, 5, 5, 6, 3, 6, 9, 34, 3, 2};

       printUniqueNumbers(nums);
    }
    public static void printUniqueNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(nums[i]);
            }
        }
    }
}
