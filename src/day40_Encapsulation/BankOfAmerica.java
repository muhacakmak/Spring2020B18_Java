package day40_Encapsulation;

public class BankOfAmerica {
    public static void main(String[] args) {
        EmployeeInfo employeeInfo1=new EmployeeInfo();

        employeeInfo1.setAddress("Virgina");
        employeeInfo1.setSalary(120000.50);



        System.out.println( employeeInfo1.getAddress());
        System.out.println(employeeInfo1.companyName);
        System.out.println(employeeInfo1.getSalary());





    }
}
