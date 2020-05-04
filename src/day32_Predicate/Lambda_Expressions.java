package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        Predicate <Integer> oddNumber = x -> x % 2 != 0;
//        for (int x = 0; x < 5; x++) {
//            if(x%2!=0){
//
//            }
//
//        }
        ArrayList <Integer> list = new ArrayList <>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        list.removeIf(oddNumber);

        System.out.println(list);

        System.out.println("===========================================");
        Predicate <Integer> lastThanFive = p -> p < 5;
        ArrayList <Integer> list1 = new ArrayList <>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list1.removeIf(lastThanFive);
        System.out.println(list1);

        System.out.println("===========================================");
        ArrayList <String> names = new ArrayList <>();
        names.addAll(Arrays.asList("Elif", "Selcuk", "Emir", "Tahir", "Muhammed", "Mehmet"));
        Predicate <String> startWithM = s -> s.startsWith("M");
        names.removeIf(startWithM);
        System.out.println(names);

        System.out.println("====================================");
        ArrayList <String> nameList = new ArrayList <>(); // remove start with M and A
        Predicate <String> startWithMorA = each -> each.startsWith("M") || each.startsWith("A");

        nameList.addAll(Arrays.asList("Muhtar", "Alex", "Asiye", "Dilnaz", "Radu"));
        nameList.removeIf(startWithMorA);
        System.out.println(nameList);
        System.out.println("======================================================");
        //c -> c >= 48 && c <= 57;
        Predicate <Character> digits = c -> Character.isDigit(c);
        ArrayList <Character> chars = new ArrayList <>();
        chars.addAll(Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));
        chars.removeIf(digits);
        System.out.println(chars);

        System.out.println("==================================================");
        ArrayList<Integer>nums=new ArrayList <>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        nums.removeIf(p->p>5);
        System.out.println(nums);




    }
}
