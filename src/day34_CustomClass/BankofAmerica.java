package day34_CustomClass;

import day24_Methods.Test;
import day30_ArrayList.ArrayList_Reverse;

import java.util.ArrayList;
import java.util.Arrays;

public class BankofAmerica {
    public static void main(String[] args) {
        Testers tester1 = new Testers();
        tester1.setTestersInfo("Madina", 1112233445, "QA", 130000);
        Testers tester2 = new Testers();
        tester2.setTestersInfo("Venera", 234567834, "Senior SDET", 130000);
        Testers tester3 = new Testers();
        tester3.setTestersInfo("Sha", 6235487, "SDET", 100000);
        Testers tester4 = new Testers();
        tester4.setTestersInfo("Muhtar", 111, "Manual Tester", 120000);
        Testers tester5 = new Testers();
        tester5.setTestersInfo("John", 222222, "Uber Driver", 60000);


        ArrayList <Testers> testers = new ArrayList <>();
        testers.addAll(Arrays.asList(tester1, tester2, tester3,tester4,tester5));


        testers.removeIf(p->!p.jobTitle.contains("SDET"));
        double totalBudget=0;
        for (Testers each:testers) {
            System.out.println(each);
            totalBudget+=each.salary;
        }
        System.out.println(totalBudget);






    }
}
