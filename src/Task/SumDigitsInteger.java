package Task;

public class SumDigitsInteger {
    public static void main(String[] args) {
        int number=123;

        int firstDigit=number%10;//when u divided 10 left 3
                                // 3 our firstDigit

        number=number/10; //here we are assigning new value for number
                          // now number becomes after divided 10
                         //  number= 123/10.... new number=12
        int secondDigit=number%10;//the same logic like firstDigit.
                                  // number =12 when u divided 10 left 12%10 =2
                                  // 2 is secondDigit
        int thirdDigit=number/10; // now our number is still number=12
                                  // when you divided 10 number =12/10 =1
                                  // 1 is our thirdDigit

        System.out.println(firstDigit+secondDigit+thirdDigit);
    }
}
