package day40_Encapsulation.Day42;

public class Test {
    public static void main(String[] args) {
        TestDate obj=new TestDate();
        // System.out.println(obj.name); the data is private
        int a=obj.getID();
        System.out.println(obj.getID());//
        System.out.println(obj.getName());



        obj.setName("Selcuk");
        //System.out.println(obj.ID);the data is private
        System.out.println(obj.getName());
        obj.setID(400);
        System.out.println(obj.getID());





    }
}
