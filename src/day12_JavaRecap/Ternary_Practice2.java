package day12_JavaRecap;

import java.util.Scanner;

public class Ternary_Practice2 {
    public static void main(String[] args) {

        char char1='A';

        String result=(char1=='A')?"A is selected":(char1=='B')?"B is selected"
                :(char1=='C')?"C is selected":(char1=='D')?"D is selected"
                :(char1=='E')?"E is selected":"Invalid Character";

        System.out.println(result);
        String str="Selcuk";
        String str2=new String("Selcuk");
        System.out.println(str);
        System.out.println(str2);



    }
}
