package day48_Abstraction.Task01;

public class PhoneObjects {
    public static void main(String[] args) {
        iPhone iPhone1 = new iPhone("X", 1000, "10 inches");
        iPhone iPhone2 = new iPhone("8", 900, "8 inches");


        System.out.println(iPhone1);
        System.out.println(iPhone2);
        iPhone1.faceTiming(12564863);

        System.out.println("===========================================");
        Samsung samsung1=new Samsung("Note10 Plus",1200,"Large");
        System.out.println(samsung1);
        samsung1.calling(123546);
        samsung1.freezing();
        samsung1.texting(123568);



    }
}
