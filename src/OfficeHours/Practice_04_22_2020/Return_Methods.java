package OfficeHours.Practice_04_22_2020;

public class Return_Methods {
    public static void main(String[] args) {

        sum(2, 5);

        int num1 = sum2(10, 20);

        System.out.println("======================================");
        String str = "Bank of Amrica";
        String reverse=reverse(str);
        System.out.println("Reverse value of \""+str+"\" is : "+ reverse);
        System.out.println(str+" is palinadrome: "+str.equalsIgnoreCase(reverse));



    }
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }
    public static int sum2(int a, int b) {
        return a + b;
    }
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }

}
