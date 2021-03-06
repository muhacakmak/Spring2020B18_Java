package day33_CustomClass.WarmUp;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChars3 {
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
        char []arr=str.toCharArray();
        Character[]ch=new Character[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            ch[i]=arr[i];
        }
        System.out.println(Arrays.toString(ch));

        ArrayList <Character> letters = new ArrayList <>(Arrays.asList(ch));
        letters.removeIf(p->!Character.isLetter(p));


        ArrayList <Character> digit = new ArrayList <>(Arrays.asList(ch));
        digit.removeIf(p->!Character.isDigit(p));


        ArrayList <Character> specialChars = new ArrayList <>(Arrays.asList(ch));
        //specialChars.removeAll(letters);
        //specialChars.removeAll(digit);
        specialChars.removeIf(p->Character.isDigit(p)||Character.isLetter(p));





        System.out.println(letters);
        System.out.println(digit);
        System.out.println(specialChars);
    }
}
