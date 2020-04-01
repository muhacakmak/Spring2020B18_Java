package day14_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {

        String str1="CYBERTEK";
        String str2="cybertek";
        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str2));


        String s1="Cybertek School";

        boolean r1=s1.contains("school");
        System.out.println(r1);
        System.out.println("===============");


        String s3="Unit States";
        System.out.println(s3.startsWith("U"));


        String s4="Cybertek School";
        System.out.println(s4.endsWith("l"));
        System.out.println(s4.endsWith("School"));
        System.out.println(s4.endsWith("Ceybertek"));




    }
}
