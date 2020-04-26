package day25_MethodsRecap.WarmUp2;

public class Frequency {
    /*
    2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2
     */
    public static void main(String[] args) {
        String str1="java java java java java";
        String str2="java";



        int count=0;
        while (str1.contains(str2)){
            count++;
            str1=str1.replaceFirst(str2,"");

        }
        System.out.println(str1);
        System.out.println(count);
        String a="python python python python";
        String b="python";
        int num1=frequency(a,b);
        System.out.println(num1);

    }
    public static int frequency(String str1,String str2){
        int count=0;
        while (str1.contains(str2)){
            count++;
            str1=str1.replaceFirst(str2,"");
            // we need to make that we are not counting the same index over again

        }
        return count;
    }
}
