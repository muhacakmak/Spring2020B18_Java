package OfficeHours.Practice_04_01_2020;

public class trimMethods {
    public static void main(String[] args) {

        // trim(): removes unused space from the string

        String str7="        Cybertek";
        str7.trim();//cybertek
        System.out.println("Before trim");
        System.out.println(str7);
        System.out.println(str7.length());
        System.out.println("After trim");
        str7= str7.trim();
        System.out.println(str7);
        System.out.println(str7.length());

        System.out.println("Before trim");
        String str8="        ";
        System.out.println(str8.length());
        System.out.println("After trim");

        System.out.println(str8.trim().length());






    }
}
