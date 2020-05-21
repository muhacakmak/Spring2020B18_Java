package day43_MethodOverriding.Car;

public class CarShop {
    public static void main(String[] args) {
        Tesla tesla=new Tesla();
        tesla.start();
        System.out.println("========================");
        Honda honda=new Honda();
        honda.start();

        System.out.println("========================");
        Jeep jeep1=new Jeep();
        jeep1.start();

    }
}
