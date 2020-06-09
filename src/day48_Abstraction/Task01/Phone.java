package day48_Abstraction.Task01;

/*
1. create an abstract class called Phone
            attributes: brand, model, price, size
            abstract methods: calling(), texting()
            instance method: toString()

 */
public abstract class Phone {
    public static String brand;
    public String model;
    public double price;
    public String size;


    public abstract void calling(long PhoneNumber);

    public abstract void texting(long PhoneNumber);

    public String toString() {
        return "Brand: "+brand+", Model: "+ model+", Price: $"+price+", Size: "+size;
    }

}
