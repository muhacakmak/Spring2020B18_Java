package day40_Encapsulation;

public class BankOfAmerica {
    private final int a=100;
    public static void main(String[] args) {
        EmployeeInfo employeeInfo1=new EmployeeInfo();
         int a=100;

        employeeInfo1.setAddress("Virgina");
        employeeInfo1.setSalary(120000.50);



        System.out.println( employeeInfo1.getAddress());
        System.out.println(employeeInfo1.companyName);
        System.out.println(employeeInfo1.getSalary());





    }
}
