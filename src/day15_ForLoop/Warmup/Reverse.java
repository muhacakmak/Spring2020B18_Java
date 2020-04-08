package day15_ForLoop.Warmup;

import java.util.Scanner;

public class Reverse {
    /*
    3. write a program that can Reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt metho
     */
    public static void main(String[] args) {

        String str="Java";

        String reverse1=""+str.charAt(str.length()-1)+str.charAt(str.length()-2)+str.charAt(str.length()-3)+str.charAt(str.length()-4);
        String reverse2=str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);


        System.out.println(reverse1);
        System.out.println(reverse2);




    }
}
