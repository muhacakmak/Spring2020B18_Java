package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1="Cat";// string pool
        String str2=new String("Cat");// java heap
        System.out.println(str1+" : "+str2);
        System.out.println(str1==str2);
        String str3="Cat";
        System.out.println(str1==str3);

        String str4=new String("Cat");
        System.out.println(str2==str4);


    }
}
