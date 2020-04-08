package day16_ForLoop;

public class RemoveDuplicates {
    /*
    write a program that can remove duplicated characters from a string
            abcdabcd ==> abcd
     */
    public static void main(String[] args) {
        String str="abab";

        String result="";
        for (int i = 0; i <=3; i++) {
            /*
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
             */
            if(result.contains(""+str.charAt(i)))
                continue;
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
