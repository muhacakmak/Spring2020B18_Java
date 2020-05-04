package day33_CustomClass;

public class Car {

    String Brand;
    String model;
    int year;
    String color;

    public void start() {
        System.out.println(Brand + " is started");
    }

    public void drive() {
        System.out.println("Driving " + Brand + " " + model);
    }

    public void getCarInfo() {
        System.out.println(year+" "+Brand+" "+model+" "+color);

    }
    public void setCarInfo(String carBrand,String carModel, int carYear,String carColor){
        Brand=carBrand;
        model=carModel;
        year=carYear;
        color=carColor;
    }
    public String toString(){

      return year+" "+Brand+" "+model+" "+color;
    }


    public static void main(String[] args) {


    }
}
