package day29_Wrapper_ArrayList.ArrayListReview;

import java.util.ArrayList;
import java.util.Arrays;

public class AddMethods {
    public static void main(String[] args) {
        //add(): adds Objects to the arraylist
        ArrayList <Integer> scores = new ArrayList <>();
        scores.add(10);  // Autoboxing size :1
        scores.add(20);  // Autoboxing size :2
        scores.add(30);  // Autoboxing size :3

        System.out.println(scores);
        Integer a1 = scores.get(2);// non
        int a = scores.get(2); // unboxing

        double a3 = scores.get(2);// unboxing
        System.out.println(a);


    }
}
