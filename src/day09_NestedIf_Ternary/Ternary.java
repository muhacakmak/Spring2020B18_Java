package day09_NestedIf_Ternary;

public class Ternary {
    public static void main(String[] args) {
        int num=100;
        String result =" ";
        if(num%2==0){
            result="Even";
        }else {
            result="Odd";
        }
        System.out.println("Result = "+result);

        int num0=100;
        String result2=(num0%2==0)? "Even":"Odd";
        System.out.println("Result2 ="+result2);

        int num1=100;
        int num2=200;
        int max=0;
        if(num1>num2){
            max=num1;
        }else {
            max=num2;
        }
        System.out.println("Seljuk number= "+max);

        int max2=(num1>num2)?num1:num2;
        System.out.println("Seljuk Number2= "+max2);
        System.out.println("===========================");
        String str=" ";
        if(true){
            str="Hello";
        }else {
            str="Hola";
        }
        System.out.println("Str1 = "+str);

        String str2=(true)? "Hello":"Hola";

        System.out.println("str2 = "+str2);

    }
}
