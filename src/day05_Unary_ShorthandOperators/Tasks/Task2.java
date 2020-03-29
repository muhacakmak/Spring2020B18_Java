package day05_Unary_ShorthandOperators.Tasks;

public class Task2 {
    public static void main(String[] args) {
        int a = 50;//50
        a = --a + a++ + a-- + a++;
        //  49+ 49  +50  +49  =197

        System.out.println(a);

        int x = 4;// 4

        int y=x*4-x++;
         //   4*4-4
        System.out.println(y);


    }

}
