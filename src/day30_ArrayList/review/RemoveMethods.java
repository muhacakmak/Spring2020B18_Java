package day30_ArrayList.review;
import java.util.ArrayList;
public class RemoveMethods {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList <>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);


        System.out.println(list1);
        //list1.remove(1);
       // [1, 2, 3, 4]
        Integer a = 1;

        list1.remove(a);

        System.out.println(list1);
        ArrayList <Integer> list2 = new ArrayList <>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        //{10, 20, 30}
        Integer b=20;
        boolean r=list2.remove(b);
        System.out.println(list2);



    }
}
