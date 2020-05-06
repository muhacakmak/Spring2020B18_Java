package day33_CustomClass.day37_ClassAndObject;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car();

        car1.brand="BMW";
        car1.color="White";
        car1.millage=100000;
        car1.model="X6";
        car1.price=15000.5;
        car1.year=2000;

        System.out.println(car1.brand);//BMW
        System.out.println(car1.color);
        System.out.println(car1.millage);
        System.out.println(car1.model);
        System.out.println(car1.price);
        System.out.println(car1.year);


        System.out.println("============================================");
        Car car2=new Car();

        car2.brand="Toyota";
        car2.model="Corolla";
        car2.color="Black";
        car2.millage=150000;
        car2.year=2002;
        car2.price=2000;

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.millage);
        System.out.println(car2.color);
        System.out.println(car2.price);
        System.out.println("============================================");
        car1.drive();
        car2.drive();
        System.out.println("============================================");
        car1.start();
        car2.start();
        System.out.println("============================================");
        car1.getInfo();
        car2.getInfo();






















    }

}
