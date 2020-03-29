package Task;
import java.util.Scanner;
public class hotOrCold {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = " ";
        System.out.print("DRINK TYPE: (1 for Hot Drink 2 for Cold drink)");
        int drinkType = scan.nextInt();
        if (drinkType == 1 || drinkType == 2) {
            if (drinkType == 1) {
                System.out.println("Hot Drink was Chosen");
                System.out.print("What would you like to drink ?\n1-TEA  2-COFFEE :");
                int hotDrink = scan.nextInt();
                if (hotDrink == 1) {
                    result = "TEA and you need to pay $2";
                } else if (hotDrink == 2) {
                    result = "COFFEE and you need to pay $4";
                } else {
                    result = "INVALID SELECTION";
                }
            } else if (drinkType == 2) {
                System.out.println("Cold Drink was Chosen");
                System.out.println("What would you like to drink ?\nICED TEA or LEMONADE ");
                int coldDrink = scan.nextInt();
                if (coldDrink == 1) {
                    result = "ICED TEA and you need to pay $3.2";
                } else if (coldDrink == 2) {
                    result = "LEMONADE and you need to pay $2";
                } else {
                    result = "INVALID SELECTION";
                }
            }
        } else {
            result = "INVALID SELECTION";
        }
        System.out.println("You choose "+result);
    }
}



