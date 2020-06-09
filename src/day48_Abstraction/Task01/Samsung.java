package day48_Abstraction.Task01;

public class Samsung extends Phone {

    public Samsung(String brand, String model, double price, String size) {
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.size=size;
    }


    @Override
    public void calling() {
        System.out.println("Samsung is calling");

    }

    @Override
    public void texting() {
        System.out.println("Samsung is texting");

    }

    @Override
    public String toString() {
        return "Brand: "+brand+", model"+ model+", price: $"+price+", size: "+size;
    }
}
