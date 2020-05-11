package day36_StaticBlocks.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAzerbaijan {
    public static void main(String[] args) {
        HumanResources humanResources=new HumanResources();
        ArrayList <Employee> employeeList=new ArrayList <>();
        employeeList.addAll(Arrays.asList(HumanResources.employee1,HumanResources.employee2));


        System.out.println(employeeList.size());
        for (Employee each:employeeList) {
            System.out.println(each);
        }

    }
}
