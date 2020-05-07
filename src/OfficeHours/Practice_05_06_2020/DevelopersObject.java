package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {
    public static void main(String[] args) {
        Developer developer1=new Developer();
        developer1.setInfo("John","Senior Developer",160000,18121993);
        System.out.println(developer1);

        Developer developer2=new Developer();
        developer2.setInfo("Leon","Senior Developer",180000,12456);
        developer1.coding();
        developer1.fixingBugs();
        developer2.fixingBugs();

        System.out.println("regular =========================================");

        Developer[]arr={developer1,developer2};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("each =========================================");
        for (Developer each:arr) {
            System.out.println(each.name+" = $"+each.salary);

        }
        System.out.println("ArrayList =======================================");
        ArrayList<Developer>developers=new ArrayList <>();
        developers.addAll(Arrays.asList(arr));
        System.out.println("regular =========================================");
        for (int i = 0; i <developers.size() ; i++) {
            System.out.println(developers.get(i).name);
        }
        System.out.println("each =========================================");
        for (Developer each:developers) {
            System.out.println(each.name+" = $"+each.salary);
        }
    }
}
