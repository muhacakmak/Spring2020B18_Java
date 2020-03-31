package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {

        System.out.println("======indexOf===============");

        String str="I like Java programming John";
        int indexNumberOfJ=str.indexOf("J");
        int indexNumberOfSecondJ=str.indexOf("John");
        System.out.println(indexNumberOfJ);
        System.out.println(indexNumberOfSecondJ);

        String str2="Cybertek school is awesome";

        int firstS=str2.indexOf("s");
        System.out.println(firstS);
        int secondS=str2.indexOf("is"+1);
        System.out.println(secondS);


        int maxIndexNumber= "Ceybertek".length()-1;
        System.out.println(maxIndexNumber);


        String names="Muhtar";
        int a1=names.indexOf("Good Guy");
        System.out.println(a1);

        String fullName="Selcuk Sudemirci";
        String firstName=fullName.substring(0,fullName.indexOf(" "));
        String lastName=fullName.substring(fullName.indexOf(" ")+1);
        System.out.println(firstName);
        System.out.println(lastName);










    }
}
