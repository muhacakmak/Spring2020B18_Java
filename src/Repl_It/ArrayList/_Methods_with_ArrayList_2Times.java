package Repl_It.ArrayList;

import java.util.ArrayList;

public class _Methods_with_ArrayList_2Times {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList <>();
        nums.add(1);
        nums.add(5);
        nums.add(3);
        nums.add(7);

        twoTimes(nums);
        System.out.println( twoTimes(nums));



    }

    public static ArrayList <Integer> twoTimes(ArrayList <Integer> list) {
        ArrayList <Integer> twoTimes = new ArrayList <>();

        for (int i = 0; i < list.size(); i++) {
            Integer eacNumber = list.get(i);

            twoTimes.add(eacNumber);
            twoTimes.add(eacNumber);

        }
        return twoTimes;

    }
}

