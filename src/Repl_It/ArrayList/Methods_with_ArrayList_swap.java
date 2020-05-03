package Repl_It.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_with_ArrayList_swap {
    public static void main(String[] args) {

        String []arr={"a","c","b","d","e"};

        ArrayList<String>list=new ArrayList <>(Arrays.asList(arr));
        System.out.println(list);
        String post1=list.get(0);
        String post2=list.get(2);
       // list.removeAll()
        list.add(0,list.get(3));

        list.add(3,list.get(1));

        System.out.println(list);



    }
    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {
//        ArrayList<String>list=new ArrayList <>(Arrays.asList());
//        list.set(pos2,list.get(pos1));




return list;
    }

}
