package OfficeHours.Practice_04_01_2020;

public class substringMethods {
    public static void main(String[] args) {

        // substring(begging Index,ending Index) creating substring starting from
        // begining index till ending index
        String sentences1 = "I like Java";
        //                 012345678910

        String word1 = sentences1.substring(7, sentences1.length());// "Java"
        System.out.println(word1);

        String word2=sentences1.substring(2,6);
        System.out.println(word2);
        // substring (begging index)

        String sentence2="I like to learn Java";
        String word3=sentence2.substring(10);
        System.out.println(word3);
        String r2="Java";// JaVa
        String r3=r2.substring(0,2).concat(r2.substring(2,3).toUpperCase().concat(r2.substring(3)));
        System.out.println(r3);





    }
}
