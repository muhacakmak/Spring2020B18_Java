package Repl_It.ArrayList;

import java.util.ArrayList;

public class _184_Methods_with_ArrayList_6_remove {
    public static void main(String[] args) {
        ArrayList<Double>dubs=new ArrayList <>();
        dubs.add(6.2);
        dubs.add(1.2);
        dubs.add(3.3);
        dubs.add(11.1);
        dubs.add(9.9);
        dubs.add(2.2);
        dubs.add(5.5);
       // System.out.println(dubs);//[6.2, 1.2, 3.3, 11.1, 9.9, 2.2, 5.5]
//        dubs.remove(0);
//        dubs.remove(0);
        System.out.println(dubs);



        //test(dubs);
        test(dubs);





    }
    public static void test(ArrayList <Double> dubs) {
        dubs.remove(0);
        dubs.remove(0);
        System.out.println(dubs);
    }

}
