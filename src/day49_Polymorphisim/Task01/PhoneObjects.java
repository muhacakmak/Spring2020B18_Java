package day49_Polymorphisim.Task01;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone1=new Iphone("Iphone 10 Pro",1000.50,"10 inches");
        System.out.println(iphone1);
        iphone1.calling(911);
        iphone1.texting(911);
        iphone1.faceTiming(1234556);
        iphone1.download();
    }

}
