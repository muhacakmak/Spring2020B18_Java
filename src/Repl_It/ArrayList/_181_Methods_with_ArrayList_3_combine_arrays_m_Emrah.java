package Repl_It.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _181_Methods_with_ArrayList_3_combine_arrays_m_Emrah {
    public static void main(String[] args) {

        String[] r1 = {"f", "o", "o"};
        String[] r2 = {"b", "a", "r", "k"};
        String result = "";


        ArrayList <String> list = new ArrayList <>();

        list.addAll(Arrays.asList(r1));
        list.addAll(Arrays.asList(r2));


        for (String eachList:list){
            result+=eachList;// +f,f+o

        }
    }
    public static String combineRs(String[] r1, String[] r2) {
//        String result = "";
//        ArrayList <String> list = new ArrayList <>();
//        for (int i = 0; i < r1.length; i++) {
//            list.add(r1[i]);
//        }
//        for (int i = 0; i < r2.length; i++) {
//            list.add(r2[i]);
//        }
//        for (int i = 0; i < list.size(); i++) {
//            result += list.get(i);
//        }
//        return result;

        String result = "";
        ArrayList <String> list = new ArrayList <>();
        list.addAll(Arrays.asList(r1));
        list.addAll(Arrays.asList(r2));
        for (String eachList:list){
            result+=eachList;
        }
        return result;
    }
}
