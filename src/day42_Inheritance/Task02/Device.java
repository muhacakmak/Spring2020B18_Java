package day42_Inheritance.Task02;
/*
creata a class called device:
				attributes: brand, model, price, country
				methods: toString

 */
public class Device {
    public String brand;
    public String model;
    public double price;
    public String country;

    public String toString(){
        return "Brand: "+brand+", Model: "+model+", price: "+price+", country: "+country;

    }

}
