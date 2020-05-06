package day33_CustomClass.day37_ClassAndObject;

public class Car {

    String model;
    int year;
    String color;
    double price;
    long millage;
    String brand;

    public void drive() {
        System.out.println("Driving " + brand);
    }
    public void start() {
        System.out.println(brand + " is started");
    }
    public void getInfo(){
        System.out.println(year+" "+brand+" "+model+", "+color+", "+millage+"miles, $"+price);
    }




}
