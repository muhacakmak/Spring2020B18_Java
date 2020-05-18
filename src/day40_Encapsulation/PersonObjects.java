package day40_Encapsulation;

public class PersonObjects {

    public static void main(String[] args) {
        Person person1=new Person("Zarina");
        System.out.println("Name: "+ person1.name);

        System.out.println("Before setter SSN: "+person1.getSNN());
        person1.setSNN(123);
        System.out.println("After setter SSN: "+person1.getSNN());

        //System.out.println(person1.ID);before setter
        System.out.println("Before setter ID: "+person1.getID());

        person1.setID(12356);
        System.out.println("After setter ID: "+person1.getID());


    }
}
