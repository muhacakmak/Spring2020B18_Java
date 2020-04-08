package OfficeHours.Practice_04_01_2020;

public class indexOf_lastIndexOf_Methods {
    public static void main(String[] args) {
        // indexOf(): returns the index of first matching character, as  an int

        String y1="Today W is Wednesday";
        int a1=y1.indexOf("W");

        int a2=y1.indexOf("Wednesday");
        System.out.println(a1);
        System.out.println(a2);

        // lastIndexOf(str):returns the index of last matching character, as an int
        String y2="Cybertek School, School";
        int a3=y2.lastIndexOf("S");
        System.out.println(a3);



    }
}
