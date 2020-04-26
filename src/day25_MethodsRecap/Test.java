package day25_MethodsRecap;
import Resources.Library;

public class Test {

    public static void main(String[] args) {

        String str="ABCDABCABABABA";
        String result=Library.removeDuplicate(str);

        System.out.println(result);

        String str1="AABBCDEB";
        String str2="B";
        int num1=Library.frequency(str1,str2);
        System.out.println(num1);



        String str3="MMMMNNNNKDSFSDFLKKKKKLLLL";
       String result3= Library.FrequencyOfChars(str3);
        System.out.println(result3);

    }
}
