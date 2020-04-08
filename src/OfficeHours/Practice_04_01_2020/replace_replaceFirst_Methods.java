package OfficeHours.Practice_04_01_2020;

public class replace_replaceFirst_Methods {
    public static void main(String[] args) {

        String str="I like C#, C# is cool";

        str=str.replace("C#","Java");

        System.out.println(str);
        String t1="Java is fun, Java is good";
        t1=t1.replaceFirst("Java","C#");
        System.out.println(t1);


    }
}
