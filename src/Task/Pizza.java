package Task;

public class Pizza {
    private String size;
    private int cheeseTop;
    private int peperoniTop;
    private int hamTop;

    public Pizza(String size, int cheeseTop, int peperoniTop, int hamTop) {
        this.size = size;
        this.cheeseTop = cheeseTop;
        this.peperoniTop = peperoniTop;
        this.hamTop = hamTop;
    }

    public void setPizza(String size, int cheeseTop, int peperoniTop, int hamTop) {
        this.size = size;
        this.cheeseTop = cheeseTop;
        this.peperoniTop = peperoniTop;
        this.hamTop = hamTop;
    }
    public String getDescription() {
        return size +"Task.Pizza with "+cheeseTop+" Cheese toppings, "+peperoniTop+
                " Pepperoni toppings, and "+hamTop+" Ham toppings."+"\nTotal Price: "+calcCost();
    }
    public double calcCost() {
        double cost = 0;
        if (size.equalsIgnoreCase("small")) {
            cost += 10 + (2 * cheeseTop) + (2 * peperoniTop) + (2 * hamTop);
        } else if (size.equalsIgnoreCase("medium")) {
            cost += 10 + (2 * cheeseTop) + (2 * peperoniTop) + (2 * hamTop);
        } else if (size.equalsIgnoreCase("large")) {
            cost += 10 + (2 * cheeseTop) + (2 * peperoniTop) + (2 * hamTop);
        }
        return cost;
    }
}
class Order{
    public static void main(String[] args) {
        Pizza pizza = new Pizza("small", 1, 1, 1);
        System.out.println(  pizza.getDescription());
    }


}

