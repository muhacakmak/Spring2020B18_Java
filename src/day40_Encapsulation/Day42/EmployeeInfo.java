package day40_Encapsulation.Day42;

public class EmployeeInfo {
    /*
    name,SNN, Age, Salary
     */
    private String name;
    private long SSN;
    private byte age;
    private double salary;

//    public EmployeeInfo(String name, long SSN, byte age, double salary) {
//        this.name = name;
//        this.SSN = SSN;
//        this.age = age;
//        this.salary = salary;
//    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;

    }

    public long getSSN() {
        return SSN;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }
    public double getSalary(){
        return salary;
    }
    public void setInfo(String name,long SSN,byte age, double salary){
        setName(name);
        setSSN(SSN);
        setAge(age);
        setSalary(salary);

    }
    public String getInfo(){
        return name+"\n"+SSN+"\n"+age+"\n"+salary;
    }

}
