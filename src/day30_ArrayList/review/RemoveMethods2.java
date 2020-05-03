package day30_ArrayList.review;
import java.util.ArrayList;

public class RemoveMethods2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        //list.remove(1);

        String str="Z";
       boolean r1= list.remove(str);

       boolean r2=list.remove("A");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(list);
        list.clear();
        System.out.println(list);









    }
}
