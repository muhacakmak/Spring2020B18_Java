package day40_Encapsulation.Day42;

public class AmericanAirLine {
    public static void main(String[] args) {

        EmployeeInfo emrah=new EmployeeInfo();
        emrah.setName("Emrah");
        System.out.println(emrah.getName());
        emrah.setSSN(123456);
        System.out.println(emrah.getSSN());
        emrah.setAge((byte) 32);
        System.out.println(emrah.getAge());
        emrah.setSalary(120_00);
        System.out.println(emrah.getSalary());

        System.out.println("=================================");

        EmployeeInfo rohan=new EmployeeInfo();
        rohan.setInfo("Rohan",3215672,(byte)20,150000);
        System.out.println(rohan.getInfo());



    }
}
