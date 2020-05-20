package day42_Inheritance.Task02;
/*
create ba class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */
public class Phone extends Device{
    /*
      brand;(Inheritance)
      model;(Inheritance)
      price;(Inheritance)
      country;(Inheritance)
     */
    public Phone(String brand,String model,double price,String size,String country) {
        setDevice(brand, model, price, "Phone", size,country);

    }

    public void call(){
        System.out.println("Calling by "+brand);
    }
    public void text(){
        System.out.println("Texting by "+brand);
    }

}
