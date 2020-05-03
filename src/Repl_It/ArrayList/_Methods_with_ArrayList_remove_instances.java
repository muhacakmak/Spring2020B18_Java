package Repl_It.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _Methods_with_ArrayList_remove_instances {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList <>();
        Integer[] nums = new Integer[]{1,1,2,3,1,4 };
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr, 1));


    }

    public static ArrayList <Integer> removeInst(ArrayList <Integer> r, Integer n) {
        r.removeAll(Arrays.asList(n));


        return r;
    }

}
