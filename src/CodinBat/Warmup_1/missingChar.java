package CodinBat.Warmup_1;

import java.util.Scanner;

public class missingChar {
    /*
    Given a non-empty string and an int n, return a new string where
    the char at index n has been removed. The value of n will be a
    valid index of a char in the original string
    (i.e. n will be in the range 0..str.length()-1 inclusive).
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int n=input.nextInt();

        String remove=str.substring(n,n+1);

        str=str.replace(remove,"");

        System.out.println(str);



    }
}
