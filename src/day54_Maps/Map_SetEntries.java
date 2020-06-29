package day54_Maps;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {
    public static void main(String[] args) {

        LinkedHashMap <String, String> fb = new LinkedHashMap <>();
        fb.put("Tester01", "password1");
        fb.put("Tester02", "password1");
        fb.put("Tester02", "password2");

        fb.put("Tester03", "password3");
        fb.put("Tester04", "password4");
        fb.put("Tester05", "password5");

        System.out.println(fb);
        System.out.println("==========================");

        for (String eachKey: fb.keySet()) {

            System.out.println(eachKey+" "+fb.get(eachKey));
        }
        List<String>userName=new ArrayList <>(fb.keySet());
        System.out.println(userName);
        System.out.println("==========================");

        for (String eachValue:fb.values()) {
            System.out.println(eachValue);

        }

        List<String>password=new ArrayList <>(fb.values());

        System.out.println(password);

    }

}
