package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReplaceAllMethods {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList <>(Arrays.asList("Omer","Omer","Mary","Sha","Fatih","Omer"));// Irina
        System.out.println("Original list: "+names);

//        names.set(0,"Irina");
//        names.set(1,"Irina");
//        names.set(5,"Irina");
        Collections.replaceAll(names,"Omer","Irina");



        System.out.println(names);


    }
}
