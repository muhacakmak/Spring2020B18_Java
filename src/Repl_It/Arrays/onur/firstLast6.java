package Repl_It.Arrays.onur;

public class firstLast6 {
    public static void main(String[] args) {

        int[] nums = {6, 2, 6, 6};
//        boolean result=false;
//
//        if(nums[0]==6||nums[nums.length-1]==6){
//            result=true;
//        }else {
//            result=false;
//        }
//boolean a=firstLast6(nums);
        firstLast6(nums);

        //  System.out.println(result);
//       if( firstLast6(nums)){
//           System.out.println("selcuk");
//       }

        //int c=sum(3,5);
        sum(3, 5);
        sameFirstLast(nums);
        System.out.println(sameFirstLast(nums));


    }

    public static boolean firstLast6(int[] nums) {
        // boolean result = false;

        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }


    }

    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        //return sum;

    }


    public static boolean sameFirstLast(int[] nums) {


        boolean result = false;

        if (nums.length > 0) {

            if (nums[0] == nums[nums.length - 1]) {
                result = true;
            } else {
                result = false;

            }
        }

        return result;
    }





}
