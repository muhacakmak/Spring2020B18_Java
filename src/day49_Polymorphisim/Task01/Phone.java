package day49_Polymorphisim.Task01;

interface downloadable {
    boolean downloadable = false;//public abs

    void download();

}

interface AndroidApps extends downloadable {// 2 var and 1 abstract
    String AppStoreName = "Android";

}

interface AppleApps extends downloadable {
    String AppStoreName = "Apple";

}

public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void texting(long phoneNumber);

    public abstract void calling(long phoneNumber);

    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Price: " + price + ", Size: " + size;
    }

}
/*
    1. create an interface named downloadable:
        variable: boolean downloadable
abstract method: download();
        1. create an interface named AndroidApps that can inherit from downloadable interface
variable: AppStoreName

        2. create an interface named AppleApps that can inherit from downloadable interface
variable: AppStoreName
        3. create an abstract class named Phone
        variables: brand, model, price, size
abstract methods: texting(), calling()
4. create an abstract class named Phone
            variables: brand, model, price, size
            abstract methods: texting(), calling()

*/