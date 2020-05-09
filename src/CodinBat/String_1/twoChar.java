package CodinBat.String_1;

import java.util.Scanner;

public class twoChar {
    /*Given a string and an index, return a string lengthMethods 2 starting at the given index.
    If the index is too big or too small to define a string lengthMethods 2, use the first 2 chars.
    The string lengthMethods will be at least 2.
     twoChar("java", 0) → "ja"
     twoChar("java", 2) → "va"
     twoChar("java", 3) → "ja"


     */
    public static void main(String[] args) {
        String str=twoChar("hello",99);
        System.out.println(str);

    }
    public static String twoChar(String str, int index) {
        String result="";
        if(index+1>=str.length()||index<0){
            result= str.substring(0,2);
        }else{
            result= str.substring(index,index+2);
        }
        return result;
    }

}
