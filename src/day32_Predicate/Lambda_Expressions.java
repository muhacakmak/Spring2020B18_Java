package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        Predicate <Integer> oddNumber = x -> x % 2 != 0;
        ArrayList <Integer> list = new ArrayList <>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list.removeIf(oddNumber);

        System.out.println(list);

        System.out.println("===========================================");
        Predicate <Integer> lastThanFive = p -> p < 5;
        ArrayList <Integer> list1 = new ArrayList <>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list1.removeIf(lastThanFive);
        System.out.println(list1);

        System.out.println("===========================================");
        ArrayList<String>names=new ArrayList <>();
        names.addAll(Arrays.asList("Elif","Selcuk", "Emir","Tahir","Muhammed","Mehmet"));
        Predicate<String>startWithM=s->s.startsWith("M");
        names.removeIf(startWithM);
        System.out.println(names);


    }
}
