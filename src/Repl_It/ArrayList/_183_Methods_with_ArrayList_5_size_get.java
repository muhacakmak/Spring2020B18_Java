package Repl_It.ArrayList;


import java.util.ArrayList;
import java.util.Arrays;

public class _183_Methods_with_ArrayList_5_size_get {
    public static void main(String[] args) {
       ArrayList<Integer>ints=new ArrayList <>();
       ints.add(10);
       ints.add(20);
       ints.add(30);

        System.out.println(sum(ints));











    }
    public static int sum(ArrayList <Integer> ints) {
        int sum=0;
        for (int each:ints) {
            sum+=each;

        }
        return sum;
    }
}
