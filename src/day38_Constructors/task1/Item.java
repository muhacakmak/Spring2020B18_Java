package day38_Constructors.task1;
 /*
    create a class called Item
            instance variables:
                name, unitPrice, quantity
            add a constructor that can initialize the fields
            instance methods:
                calcCost(): returns the total cost as double
                            hint: quantity * unitPrice
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
    create a class called ShoppingList
            create 5 objects of Item and store them into List of Items
            calculate the total cost of all Items in the list

     */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost() {
        return quantity * unitPrice;
    }

    public String toString() {
        return "name: " + name + '\'' +
                ", unitPrice=$" + unitPrice +
                ", quantity=" + quantity +
                ", Total Cost of Item: $" + calcCost();
    }
}

class ShoppingList {
    public static void main(String[] args) {
        Item item1 = new Item("Toilet Paper", 25, 100);
        Item item2 = new Item("Paint Brush", 3, 5);
        Item item3 = new Item("Canvas", 4, 6);
        Item item4 = new Item("Apron", 5, 1);
        Item item5 = new Item("Isle", 10, 1);
        ArrayList <Item> shoppingList = new ArrayList <>(Arrays.asList(item1, item2, item3, item4, item5));
        double totalCost = 0;
        // 1 solution
//        for (Item each : shoppingList) {
//            System.out.println("| " + each.name + ":" + each.quantity + " price: $" + each.calcCost());
//            totalCost += each.calcCost();
//        }

        // 2 solution

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println("| " + shoppingList.get(i).name + ":" + shoppingList.get(i).quantity + " price: $" + shoppingList.get(i).calcCost());
            totalCost += shoppingList.get(i).calcCost();
        }



        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("+_________________________");
        System.out.println("\tTotal Cost: $" + df.format(totalCost));
    }

}

