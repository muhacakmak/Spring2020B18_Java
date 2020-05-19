package day42_Inheritance.Task02;
    /*
    create a class called TV:
                    attributes: brand, model, price, country
                    methods: watch, toString
     */
public class TV extends Device {
    /*
      brand;(Inheritance)
      model;(Inheritance)
      price;(Inheritance)
      country;(Inheritance)
     */
    public void watch(){
        System.out.println("Watching brand :"+brand);
    }

}
