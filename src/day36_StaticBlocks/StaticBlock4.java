package day36_StaticBlocks;

import OfficeHours.Practice_05_06_2020.Tester;

public class StaticBlock4 {
    static Tester tester1=new Tester();

    static String name;
    static {
        // gets executed as soon as the class loaded
        // designed to initialize static variables
        name="Ceybertek School";
        tester1.setInfo("Muhtar","SDET",120000,12356);
        tester1.setInfo("Namik","SDET",120000,12353646);
    }
    public static void main(String[] args) {

        System.out.println(name);
        System.out.println(tester1);
    }

}
