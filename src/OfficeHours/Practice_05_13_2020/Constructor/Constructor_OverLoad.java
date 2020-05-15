package OfficeHours.Practice_05_13_2020.Constructor;

public class Constructor_OverLoad {
    public Constructor_OverLoad() {
        System.out.println("Default constructor");

    }

    public Constructor_OverLoad(int a) {
        System.out.println("Constructor with int");

    }

    public Constructor_OverLoad(int a, double b) {
        System.out.println("Constructor with int and double");

    }

    public static void main(String[] args) {
        Constructor_OverLoad obj=new Constructor_OverLoad();
    }


}
