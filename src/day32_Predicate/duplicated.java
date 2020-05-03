package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicated {
    /*
    write a program that can return the duplicated values from an ArrayList of String
        Ex:
            list: {"A", "B", "A", "C", "D"};
            output: ["A"]
            list: {"A", "B", "B", "C", "D", "D"};
            output: ["B", "D"]
     */
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList <>(Arrays.asList("A", "B", "A", "C", "D"));
        ArrayList <String> duplicated = new ArrayList <>();

        String result="";
        for(String each2:list){
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                String eac=list.get(i);
                if (eac==each2){
                    count++;
                }

            }

            if(count==1){

                duplicated.addAll(Arrays.asList(each2));

            }

        }
        System.out.println(duplicated);



    }
}
