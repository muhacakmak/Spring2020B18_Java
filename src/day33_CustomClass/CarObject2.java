package day33_CustomClass;

public class CarObject2 {
     /*
            create 5 car objects
            put them in an array of cars
            use for loop to get each car info
            use for each loop to get each carinfo
         */

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCarInfo("BMW", "X6", 2020, "White");
        car1.getCarInfo();
        Car car2 = new Car();
        car2.setCarInfo("Toyota", "Corolla", 2020, "Red");
        car2.getCarInfo();

        Car car3 = new Car();
        car3.setCarInfo("Audi", "Q7", 2019, "Grey");
        car3.getCarInfo();
        System.out.println("==========================================================");

        Car [] cars={car1,car2,car3};
        for (int i = 0; i <cars.length ; i++) {
            cars[i].getCarInfo();
        }
        System.out.println("==========================================================");
        for (Car each:cars) {
            each.getCarInfo();

        }
        System.out.println("=================================");
        System.out.println(car1);





    }
}
