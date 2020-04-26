package day13_StringClass;

public class substring {
    public static void main(String[] args) {
        String str = "Cybertek School is the best";
        //            01234567
        String a=str.substring(5,7);
        //System.out.println(a);
        String son=str.substring(str.length()-1);
        String text=str.substring(1,str.length());
        System.out.println(text);






//        System.out.println("After substring-->> " + schoolName);
//
//        String fullName = "Kuzzat Altay";
//
//        String firstName = fullName.substring(0, 6);
//        String lastName = fullName.substring(7, 12);
//
//        System.out.println("First name : " + firstName);
//        System.out.println("Last name : " + lastName);
//
//        // full name =firstName lastName
//        // gmail:lastName_firstname@gmail.com
//
//        String fullName1 = "Selcuk Demirci";
//        String firstName1 = fullName1.substring(0, 6);
//        String lastName1 = fullName1.substring(7, 14);
//        //String email=lastName1.concat("_").concat(firstName1).concat("@gmail.com");
//        String email = lastName1 + "_" + firstName1 + "@gmail.com";
//        System.out.println(email);
//
//        String s1 = "I love Java Programming Language";
//        String className = s1.substring(7);
//        System.out.println(className);
//        //replace
//
//        String s2 = "I like C# Programing";
//        System.out.println("Before replace: " + s2);
//        s2 = s2.replace("C#", "Java");
//        System.out.println("After replace: " + s2);
//
//        String name = "Covid18";
//        name = name.replace("8", "9");
//        System.out.println(name);
//
//        // replace first
//        System.out.println("=======replace first==========");
//        String r1="I like C#, C# is fun, C# is cool";
//        System.out.println("Before replace --->"+r1);
//       // r1=r1.replace("C#","Java");
//        //System.out.println("After replace ----> "+r1);
//        r1=r1.replaceFirst("C#","Java");
//        System.out.println("After replaceFirs----> "+r1);
//
//


    }
}
