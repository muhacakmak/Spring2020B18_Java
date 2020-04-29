package Repl_It.ArrayList;

public class _Assessment_test_6_1_mIxEd_CaSe {
    public static void main(String[] args) {
        String s = "powerful";// pOwErFuL
        s.toLowerCase();


        //System.out.println(s.length());
//        System.out.println(s.substring(0, 1));
//        System.out.println(s.substring(2, 3));
//        System.out.println(s.substring(4, 5));
//        System.out.println(s.substring(6, 7));
//
//        System.out.println(s.substring(1,2));
//        System.out.println(s.substring(3,4));
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result += s.substring(i, i + 1).toLowerCase();
            }
            else   {
                result += s.substring(i, i+ 1).toUpperCase();
            }
//            //System.out.print(s.substring(i, i + 1));
//            //System.out.print(s.substring(k,k+1));
//            k++;

        }
        System.out.println(result);
    }
}
