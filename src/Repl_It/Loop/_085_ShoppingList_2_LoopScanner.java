package Repl_It.Loop;

import java.util.Scanner;

public class _085_ShoppingList_2_LoopScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{
            System.out.println("Enter Item"+count+" and its price:");
            item=scan.next();
            price=scan.nextDouble();
            totalPrice+=price;
            shoppingListReport+="Item"+count+": "+item+" Price: "+price+", ";
            count++;
            System.out.println("Add one more item?");
            countinue =scan.next();
            if(countinue.equalsIgnoreCase("yes")){
            }else if(countinue.equalsIgnoreCase("No")){
                break;
            }
        }while (true);
        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
        System.out.println("Total price: "+ totalPrice);
    }
}
