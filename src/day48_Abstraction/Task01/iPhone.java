package day48_Abstraction.Task01;

/*
 2. create the following subclasses of phone:
                        1. iPhone
                        2. Samsung
   create constructors in each sub class that can initialize the instance variables
 */
public class iPhone extends Phone {
    static {
        brand = "Iphone";
    }

    public iPhone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;
    }

    public void faceTiming(long phoneNumber) {
        System.out.println("Iphone is faceTiming with " + phoneNumber);
    }


    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling " + phoneNumber);

    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting " + phoneNumber);

    }
}
