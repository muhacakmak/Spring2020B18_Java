package Repl_It.Methods.returnMethods;

public class _161_Methods_with_return_6_water_tax {
    public static void main(String[] args) {
        double waterBill = waterTax(60);

        System.out.println("Water bill : " +waterBill);
        double electricBill = electricTax(60);
        System.out.println("Electric bill : " + electricBill);
        System.out.println("Total : " + (waterBill + electricBill));
    }
    public static double waterTax(double units) {
        double bill = 0.0;

        if (units <= 50) {
            bill = units * 0.60;
        } else if (units > 50 && units <= 100) {
            bill = units * 0.90;
        } else if ((units > 100) && (units <= 150)) {
            bill = units * 0.90 + 50;
        } else {
            bill = units * 0.90 + 100;
        }
        return bill;
    }
    public static double electricTax(double units) {
        double bill = 0.0;

        if (units <= 50) {
            bill = units * 1.60;
        } else if (units > 50 && units <= 100) {
            bill = units * 1.90;
        } else if ((units > 100) && (units <= 150)) {
            bill = units * 1.90 + 50;
        } else {
            bill = units * 1.90 + 100;
        }
        return bill;
    }
}
