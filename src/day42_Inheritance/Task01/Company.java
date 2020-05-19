package day42_Inheritance.Task01;

public class Company {
    /*
    create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
     */
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setEmployeeInfo("Selcuk",35,'M',110_000,1234,"Developer");
        Employee employee2=new Employee();
        employee2.setEmployeeInfo("Emarh",30,'M',120_000,56789,"SDET");
        Employee employee3=new Employee();
        employee3.setEmployeeInfo("Rustem",29,'M',130_000,3695,"PM");

        Employee [] employees={employee1,employee2,employee3};
       // System.out.println(Arrays.toString(employees));

        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i]);
            System.out.println("Name: "+employees[i].name+", EployeeID: "+employees[i].employeeID);

        }


    }
}
