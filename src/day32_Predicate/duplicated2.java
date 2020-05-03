package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class duplicated2 {
    /*
    write a program that can return the duplicated values from an ArrayList of String
        Ex:
            list: {"A", "B", "A", "C", "D"};
            output: ["A"]
            list: {"A", "B", "B", "C", "D", "D"};
            output: ["B", "D"]
     */
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList <>(Arrays.asList("A", "B", "A", "C", "D", "D"));

        System.out.println("Original list :" + list);
        ArrayList <String> result = new ArrayList <>();
//        for (String each : list) {
//            int count = Collections.frequency(list, each);
//            if (count > 1) {
//                if(result.contains(each)) {
//                    continue;
//                }
//                    result.add(each);
//            }
//        }

        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));
            if (count > 1) {
                if (result.contains(list.get(i))) {//  count>1 && !result.contains(list.get(i))
                    continue;
                }
                result.add(list.get(i));
            }

        }
        System.out.println(result);
    }
}
