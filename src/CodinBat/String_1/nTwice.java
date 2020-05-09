package CodinBat.String_1;

import java.util.Scanner;

public class nTwice {
    /*
    Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
  */

    public static void main(String[] args) {
       // Scanner input=new Scanner(System.in);
      int n=2;
      String str="Hello";

      str=str.substring(0,2)+str.substring(str.length()-2);

        System.out.println(str);

    }
    public String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n);

    }



}
