package day36_StaticBlocks;

public class StaticBlock {
    static {
        System.out.println("Static block executed ");
    }

    public static void main(String[] args) {
        System.out.println("Main methods executed");
        method1();
    }

    public static void method1() {
        System.out.println("Custom Method executed");
    }
}
