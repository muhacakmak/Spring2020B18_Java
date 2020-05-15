package OfficeHours.Practice_05_13_2020;

public class StaticBlock {
    static String str = "";
    //str=str.toUpperCase(); have to be in block


    static {
        str = "Cybertek";
        str="Harvard";
        str="MIT";
        // str=str.toUpperCase();
    }

    public static void main(String[] args) {
        str = "Cybertek"; // out side this main methods you can not use it
        // that is why we need static block
    }

}

class staticClassTest {
    public static void main(String[] args) {
        System.out.println(StaticBlock.str);
    }
}
