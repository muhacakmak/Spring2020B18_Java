package day36_StaticBlocks;

import OfficeHours.Practice_05_06_2020.Tester;
import day24_Methods.Test;

public class StaticBlock2 {
    static int a;
    static int b;
    int c;
    static Tester tester1 = new Tester();

    public static void main(String[] args) {

        System.out.println(tester1);
    }

    static {
        a = 100;
        b = 200;
        //c=100;static only accepts static
        if (100 > 200) {
            a = 100;
        } else {
            b = 200;
        }
        tester1.setInfo("Jean", "SDET", 120000, 123);

    }
}
