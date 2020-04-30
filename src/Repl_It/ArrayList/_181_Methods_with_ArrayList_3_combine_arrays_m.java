package Repl_It.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _181_Methods_with_ArrayList_3_combine_arrays_m {
    public static void main(String[] args) {

        String[] r1 = {"f", "o", "o"};
        String[] r2 = {"b", "a", "r", "k"};
        String result = "";

        ArrayList <String> list = new ArrayList <>();

        for (int i = 0; i < r1.length; i++) {
            list.add(r1[i]);
        }
        for (int i = 0; i < r2.length; i++) {
            list.add(r2[i]);
        }


        list.add(r1.length, " ");


        for (int i = 0; i < list.size(); i++) {

            result += list.get(i);

        }
        System.out.println(result);
        combineRs(r1,r2);
        System.out.println(combineRs(r1,r2));
    }
    public static String combineRs(String[] r1, String[] r2) {
        String result = "";
        ArrayList <String> list = new ArrayList <>();
        for (int i = 0; i < r1.length; i++) {
            list.add(r1[i]);
        }
        for (int i = 0; i < r2.length; i++) {
            list.add(r2[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        return result;
    }
}
