package day15_ForLoop;

public class Reversestring {
    /*
    3. write a program that can Reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt metho
     */
    public static void main(String[] args) {

        String str="Java is fun";
        String reverse="";

        for (int  i =str.length()-1;i>=0; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }
}
