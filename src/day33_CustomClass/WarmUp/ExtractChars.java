package day33_CustomClass.WarmUp;

import java.util.ArrayList;

public class ExtractChars {
    /*
    3. write a program that can extract the sepecial characters,
    digits and alphebets from a string and stores them into seperate ArrayLists of Character:
                			Task.Pizza:
                				str = "ABCD123$%#@&456EFG!";
                				list1: {$, %, #, @, &, !}
                				list2: {A, B, C, D, E, F, G}
                				list3: {1, 2, 3, 4, 5, 6}
     */
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();

        ArrayList <Character> letters = new ArrayList <>();
        ArrayList <Character> digit = new ArrayList <>();
        ArrayList <Character> specialChars = new ArrayList <>();

        for (char each : arr) {
            if (Character.isLetter(each)) {  //
                letters.add(each);
            } else if (Character.isDigit(each)) {
                digit.add(each);
            } else {
                specialChars.add(each);
            }

        }
        System.out.println(letters);
        System.out.println(digit);
        System.out.println(specialChars);

    }
}
