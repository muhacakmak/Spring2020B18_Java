package day29_Wrapper_ArrayList.ArrayListReview;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        ArrayList <String> shoppingList = new ArrayList <>();
        shoppingList.add("Milk");
        shoppingList.add("Coffee");
        shoppingList.add("Bread");
        shoppingList.add("Toilet Paper");

        System.out.println(shoppingList);
        System.out.println("regular loop ==========================");
        for (int i = 0; i <shoppingList.size() ; i++) {
            System.out.println(shoppingList.get(i));

        }
        System.out.println("each loop ==========================");
        for (String each:shoppingList){
            System.out.println(each);
        }






    }
}
