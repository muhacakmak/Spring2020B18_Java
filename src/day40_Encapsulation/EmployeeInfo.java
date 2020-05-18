package day40_Encapsulation;

public class EmployeeInfo {

    private double salary;
    private long SNN;
    private int ID;
    private String Address;
    public static String companyName="Cybertek";

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getSNN() {
        return SNN;
    }

    public void setSNN(long SNN) {
        this.SNN = SNN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
