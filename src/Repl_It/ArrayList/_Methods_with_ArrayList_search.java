package Repl_It.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _Methods_with_ArrayList_search {
    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList <String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");
        String find="foo bar";



//        if (arr.contains("foo")) {
//            int indexOf
//            arr.retainAll(Arrays.asList("foo"));
//
//            System.out.println(arr);
//        }


    }

    public static String search(ArrayList <String> r, String find) {
        r.retainAll(Arrays.asList(find));

        return r.get(0);

    }


}
