package day50_Polymorphim_Recap_OOP.Recape_OPP;

public class Encapsulation {
    private String userName="MIT";

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
       this. userName=userName;

    }

}
class Test{
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        System.out.println(obj.getUserName());
        obj.setUserName("Cybertek");
        System.out.println(obj.getUserName());

    }

}
