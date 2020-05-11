package day36_StaticBlocks.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAzerbaijan {
    public static void main(String[] args) {

        ArrayList <Employee> employeeList=new ArrayList <>();

        employeeList.add(HumanResources.employee1);
        employeeList.add(HumanResources.employee2);


        System.out.println(employeeList.size());
        for (Employee each:employeeList) {
            System.out.println(each);
        }

    }
}
