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

        do {
            System.out.println("Enter Item"+count+" and its price:");
            item=scan.next();
            price=scan.nextDouble();
            shoppingListReport=item+count+":"+item+" Price:"+price+", ";
            totalPrice+=price;
            count++;
            System.out.println("Add one more item?");
            countinue=scan.next();

            while (countinue.equalsIgnoreCase("yes")){
                System.out.println("Enter Item"+count+" and its price:");
                count++;
                item=scan.next();
                price=scan.nextDouble();
                shoppingListReport+=item+count+":"+item+" Price:"+price+", ";
                totalPrice+=price;
            }
            if(countinue.equalsIgnoreCase("no")){
                System.out.println(shoppingListReport+"\nTotal price: "+totalPrice);
                System.exit(0);
            }

        }while (true);

    }
}
