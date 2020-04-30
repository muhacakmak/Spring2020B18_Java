package Repl_It.ArrayList;

import java.util.ArrayList;

public class _190_Methods_with_ArrayList_11_appendPosSum {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList <>();
        nums.add(4);
        nums.add(-6);
        nums.add(3);
        nums.add(-8);
        nums.add(0);
        nums.add(4);
        nums.add(3);


//        int sumPositive = 0;
//
//        for (int i = 0; i < nums.size(); i++) {
//            Integer eachNum = nums.get(i);
//            if (eachNum > 0) {
//                sumPositive += eachNum;
//            }
//        }
//        ArrayList <Integer> numPositive = new ArrayList <>();
//        for (int i = 0; i < nums.size(); i++) {
//            Integer eachNum = nums.get(i);
//            if (eachNum > 0) {
//                numPositive.add(eachNum);
//            }
//        }
//        numPositive.add(sumPositive);
//        System.out.println(numPositive);
        appendPosSum(nums);

        System.out.println(appendPosSum(nums));
    }

    public static ArrayList <Integer> appendPosSum(ArrayList <Integer> nums) {
        int sumPositive = 0;
        for (int i = 0; i < nums.size(); i++) {
            Integer eachNum = nums.get(i);
            if (eachNum > 0) {
                sumPositive += eachNum;
            }
        }
        ArrayList <Integer> numPositive = new ArrayList <>();
        for (int i = 0; i < nums.size(); i++) {
            Integer eachNum = nums.get(i);
            if (eachNum > 0) {
                numPositive.add(eachNum);
            }
        }
        numPositive.add(sumPositive);
        return numPositive;
    }

}

