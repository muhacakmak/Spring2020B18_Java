package day40_Encapsulation;

public class Test {
    public static void main(String[] args) {

        Encapsulation obj=new Encapsulation();
      //  System.out.println(obj.SNN);
        System.out.println(obj.getSSN());//0
        //obj.SSN=12345; we can not set variable if is private

        obj.setSSN(12345);
        //System.out.println(obj.SNN);
        System.out.println(obj.getSSN());//12345


    }
}
