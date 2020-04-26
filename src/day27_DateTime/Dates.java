package day27_DateTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2020,10,25);
        System.out.println(date1);

        LocalDate birthDay=LocalDate.of(1984,12,12);

        System.out.println(birthDay);

        // isAfter(date2)
        boolean result1=date1.isAfter(birthDay);
        System.out.println(date1+" is after my birthday "+birthDay+": "+result1);

        //isBefore(date2)
        boolean result2=date1.isBefore(birthDay);
        System.out.println(date1+" is before my birthday "+birthDay+": "+result2);

        boolean result3=date1.isEqual(birthDay);
        System.out.println(date1+" is equal my birthday "+birthDay+": "+result3);

        boolean result4=birthDay.isLeapYear();
        System.out.println(birthDay+"My birthday is leap year :"+result4);
        System.out.println("==========================");

        LocalDate now=LocalDate.now();
        System.out.println("Today is : "+now);

//        LocalDate birthday_Rahman=LocalDate.of(1990,04,25);
//        int month=birthday_Rahman.getMonthValue();
//        int day=birthday_Rahman.getDayOfMonth();
//        System.out.println(day);

        String str=now.toString();
       // String str=""+now;
        System.out.println(str.replace("-"," "));






    }
}
