package CodinBat.Array_1;

/*
    Given an array of ints, return true if 6 appears as either the first or last element in the array.
    The array will be length 1 or more.

    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false
 */
public class firstLast6 {
    public static void main(String[] args) {
        boolean result=false;
        int[] nums = {13, 6, 1, 2, 3};

        int first = nums[0];
        int last = nums[nums.length - 1];
        if(first==6||last==6){
            result=true;
        }else {
            result=false;
        }
        System.out.println(result);
    }
    public boolean firstLast6(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        if(first==6||last==6){
            return true;
        }else {
            return false;
        }
    }

}
