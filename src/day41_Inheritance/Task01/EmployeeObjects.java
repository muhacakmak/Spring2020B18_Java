package day41_Inheritance.Task01;

public class EmployeeObjects {
    public static void main(String[] args) {
        Developer developer1 = new Developer(120_000, "Namik", 123, "Software Developer", 'M');
        developer1.fixingBug();
        System.out.println(developer1);
        Tester tester1=new Tester("Hilal",120_005,456,"QA",'F');
        System.out.println(tester1);
        tester1.reportingBug();
        BusinessAnalyst BA1=new BusinessAnalyst("Ozgur",120002,789,'M');
        System.out.println(BA1);
        BA1.writingRequirements();
        BA1.gathering();





    }
}
