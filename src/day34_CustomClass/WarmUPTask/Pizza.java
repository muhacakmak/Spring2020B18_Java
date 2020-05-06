package day34_CustomClass.WarmUPTask;

public class Pizza {
    String size;
    int cheeseTopping;
    int pepperoniTopping;


    public void customizeOrder(String sizeOfPizza, int amountCheeseTopping, int amountOfPepperoniTopping) {
        size = sizeOfPizza;
        cheeseTopping = amountCheeseTopping;
        pepperoniTopping = amountOfPepperoniTopping;
    }

    public double calcCost() {
        if (size.equalsIgnoreCase("Small")) {
            return 10 + pepperoniTopping * 1.5+cheeseTopping;
        } else if (size.equalsIgnoreCase("Medium")) {
            return 12 + pepperoniTopping * 1.5+cheeseTopping;
        } else if (size.equalsIgnoreCase("Large")) {
            return 14 + pepperoniTopping * 1.5+cheeseTopping;
        } else {
            return 0;
        }
    }

    public String toString(){
        return "Pizza size: "+size+"\nPepper toppings : "+pepperoniTopping+
                "\nCheese topping: "+cheeseTopping+"\nTotal Amount: $"+calcCost();
    }



}
