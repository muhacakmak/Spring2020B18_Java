package Repl_It.ArrayList;

import java.util.ArrayList;

public class _Methods_with_ArrayList_search {

    public static String search(ArrayList <String> r, String find) {
        String[] findArr = find.split(" ");
        String result = "";
        String findFirst=findArr[0].trim();
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains(findFirst)) {
                result = r.get(i);
                break;
            } else {

                result = "search failed";
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList <String> r = new ArrayList <>();
        String result = "";
        r.add("2");
        r.add("6");
        r.add("foo bar");
        r.add("abc");
        String find = "foo bar";
        System.out.println(r);
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains(find)) {
                result = r.get(i);
                break;

            } else {

                result = "search failed";
            }
        }
        System.out.println(result);
    }
}