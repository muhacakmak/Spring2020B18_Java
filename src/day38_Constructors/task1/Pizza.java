package day38_Constructors.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {
    /*1. create a custom class for pizza that should contain the following:
                instance variables:
                        size (either small, medium, large)
                        number of cheese topping
                        number of pepperoni toppings
    Add a constructor that can allow user to set the size and toppisngs of the pizza
     instance method:
                 calcCost(): returns the total cost as double
                 toString(): a String return method that's containing the pizza' size, quantity of each topping, and the
     */
    String size;
    int numberOfCheeseTopping;
    int numberOfCheesePeperoni;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfCheesePeperoni) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfCheesePeperoni = numberOfCheesePeperoni;

    }
    public double calcCost() {
        double cost = 0;
        if (size.equalsIgnoreCase("small")) {
            cost += 10 + (1.5 * numberOfCheesePeperoni) + (numberOfCheeseTopping);
        } else if (size.equalsIgnoreCase("medium")) {
            cost += 12 + (1.5 * numberOfCheesePeperoni) + (numberOfCheeseTopping);
        } else if (size.equalsIgnoreCase("large")) {
            cost += 14 + (1.5 * numberOfCheesePeperoni) + (numberOfCheeseTopping);
        }
        return cost;
    }
    public String toString() {
        return "size: " + size + ", Cheese toppings:" + numberOfCheeseTopping +
                ",  Peperoni Toppings:" + numberOfCheesePeperoni;
    }
}

class Order{
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("small", 3, 4);
        Pizza pizza2 = new Pizza("medium", 5, 6);
        Pizza pizza3 = new Pizza("small", 2, 3);
        Pizza pizza4 = new Pizza("large", 7, 6);
        Pizza pizza5 = new Pizza("large", 6, 8);

        ArrayList<Pizza>pizzasList=new ArrayList <>(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));
        double total=0;
        int i=1;
        for (Pizza each:pizzasList) {
            System.out.println(i+". order cost: $"+ each.calcCost());
            i++;
            total+=each.calcCost();
        }

        System.out.println("Total cost: $"+total);
    }
}

