package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps_Practice1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 03, 20);
        Map <String, LocalDate> classMates = new LinkedHashMap <>();

        classMates.put("Emrah", LocalDate.of(2000, 12, 01));

        classMates.put("Namik", LocalDate.of(2000, 12, 01));

        classMates.put("Saban", LocalDate.of(1900, 01, 30));

        classMates.put("Yucel", LocalDate.of(2005, 12, 28));

        classMates.put("Zafer", LocalDate.of(1985, 11, 15));
        classMates.remove("Namik");

        System.out.println(classMates.size());
        System.out.println(classMates.get("Emrah"));

        System.out.println(classMates.containsKey("Muhtar"));
        System.out.println(classMates.containsValue(LocalDate.of(2000, 12, 01)));
        System.out.println(classMates.keySet());


        LinkedHashMap <String, Integer> students = new LinkedHashMap <>();
        students.put("Adil", 92);
        students.put("Hunar", 89);
        students.put("Barzy", 75);
        students.put("Rahman", 93);
        students.put("Hardi", 80);
        LinkedHashMap <String, Integer> badStudent = new LinkedHashMap <>();
        LinkedHashMap <String, Integer> goodStudent = new LinkedHashMap <>();


        for (String eachKey : students.keySet()) {
            int eachValue = students.get(eachKey);

            if (eachValue < 90) {
                badStudent.put(eachKey,eachValue);
            }else {
                goodStudent.put(eachKey,eachValue);
            }
        }
        System.out.println(badStudent);
        System.out.println(goodStudent);




    }

}
